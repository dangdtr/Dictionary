public class Word {
    private String word_target;
    private String word_explain;

    // setter, getter
    public void setTarget(String target){
        this.word_target = target;
    }
    public void setExplain(String explain){
        this.word_explain = explain;
    }
    public String getTarget(){
        return this.word_target;
    }
    public String getExplain(){
        return this.word_explain;
    }
}
