import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // Variables para almacenar los textos de los EditText
    private String text1 = "";
    private String text2 = "";

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public boolean areTextsEqual() {
        // Método para comparar los textos
        return text1.equals(text2);
    }
}
