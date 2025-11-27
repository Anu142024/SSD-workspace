package lab2;

public class WordProcessor implements Counter {

    private String text = "";

    String getText() {
        return text;
    }

    void setText(String text) {

        this.text = text;
    }

    public int countWords(String sentence) {

        if(sentence == null)
            sentence = text;

        return sentence.split(" ").length;
    }

    public int countLetters(String sentence) {

        if(sentence == null)
            sentence = text;

        int letters = 0;

        for(int i=0; i < sentence.length(); i++) {

            if(Character.isLetter(sentence.charAt(i)))
                letters++;
        }

        return letters;
    }

    public int getLength(String sentence) {

        if(sentence == null)
            sentence = text;

        return sentence.length();
    }

}
