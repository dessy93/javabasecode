var isRunning = false;    //running用于判断是否正在计算md5
function calculateMD5( input ) {    //这里假设直接将文件选择框的dom引用传入

    //计算文件大小
    var size = 0;
    size = $('#' + input)[0].files[0].size;//byte
    size = size / 1024;//kb
    size = size / 1024;//mb

    // 如果size小于设定值 则采用SparkMD5.hashBinary( ) ，反之则采用spark.appendBinary( )，来计算MD5值
    if(size < MAXSIZE){
        doHashBinary(input);
    }else{
        doAppendBinary(input)
    }

    //hashBinary方法
    function doHashBinary( input ) {    //这里假设直接将文件选择框的dom引用传入

        if (running) {    // 如果正在计算、不允许开始下一次计算
            return;
        }

        var fileReader = new FileReader(),    //创建FileReader实例
            time;

        fileReader.onload = function (e) {    //FileReader的load事件，当文件读取完毕时触发
            running = false;

            // e.target指向上面的fileReader实例
            if (file.size != e.target.result.length) {    //如果两者不一致说明读取出错
                alert("ERROR:Browser reported success but could not read the file until the end.");
            } else {
                console.log(Finished loading!success!!);
                return SparkMD5.hashBinary(e.target.result);    //计算md5并返回结果

            }
        };

        fileReader.onerror = function () {    //如果读取文件出错，取消读取状态并弹框报错
            running = false;
            alert("ERROR:FileReader onerror was triggered, maybe the browser aborted due to high memory usage.");
        };

        running = true;
        fileReader.readAsBinaryString( input.files[0] );    //通过fileReader读取文件二进制码
    }

    //appendBinary方法
    function doAppendBinary( input ) {    //这里假设直接将文件选择框的dom引用传入
        if (running) {
            return;
        }

        //这里需要用到File的slice( )方法，以下是兼容写法
        var blobSlice = File.prototype.slice || File.prototype.mozSlice || File.prototype.webkitSlice,
            file = input.files[0],
            chunkSize = 2097152,                           // 以每片2MB大小来逐次读取
            chunks = Math.ceil(file.size / chunkSize),
            currentChunk = 0,
            spark = new SparkMD5(),    //创建SparkMD5的实例
            time,
            fileReader = new FileReader();

        fileReader.onload = function (e) {

            console("Read chunk number (currentChunk + 1) of  chunks ");

            spark.appendBinary(e.target.result);                 // append array buffer
            currentChunk += 1;

            if (currentChunk < chunks) {
                loadNext();
            } else {
                running = false;
                console.log("Finished loading!");
                return spark.end();     // 完成计算，返回结果
            }
        };

        fileReader.onerror = function () {
            running = false;
            console.log("something went wrong");
        };

        function loadNext() {
            var start = currentChunk * chunkSize,
                end = start + chunkSize >= file.size ? file.size : start + chunkSize;

            fileReader.readAsBinaryString(blobSlice.call(file, start, end));
        }

        running = true;
        loadNext();
    }


}