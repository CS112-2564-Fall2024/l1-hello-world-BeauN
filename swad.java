public class swad {
    String Word = "nothing";
    
    public swad() {
        Word = "WHVAHAWAKJDW";
    }
    public swad(String word){
        this.Word = word;
    }

    public String toString() {
        return Word;

    }

    public void setWord(String word) {
        this.Word = word;
    }
    public String getWord() {
        return Word;
    }

    public boolean equals(swad otherobj) {
        if (this.Word == otherobj.getWord()) {
            return true;
        }
        return false;
    }
}
