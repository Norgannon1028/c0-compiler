package compiler.analyser;


public class SymbolOffset {
    private int offset;
    public SymbolOffset(int offset){
        this.offset=offset;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int incOffset(){
        return this.offset++;
    }
    public int decOffset(){
        return this.offset--;
    }
}
