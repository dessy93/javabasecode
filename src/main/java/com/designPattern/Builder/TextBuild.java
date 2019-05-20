package com.designPattern.Builder;

public class TextBuild extends Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTile(String tile) {
        buffer.append("=====================\n");
        buffer.append("title:" + tile);
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("#" + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItem(String[] items) {
        for (String s : items){
            buffer.append("  ." + s + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("==================");
    }

    public String getResult(){
        return buffer.toString();
    }
}
