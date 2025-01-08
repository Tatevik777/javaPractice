package by.tatevik.javapractice.task25.util.email;

public class LetterManager {

    public  Letter  createLetter(String text){
        Letter letter=new Letter();
        letter.setText(text);
        return letter;
    }

    public void sendLetter(Letter letter){
        System.out.println("\nписьмо отправлено:\n " +letter.getText());
    }

    public void receiveLetter(Letter letter){
        System.out.println("\nписьмо получено:\n " +letter.getText());
    }
}
