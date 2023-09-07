import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public boolean compararTextos(String texto1, String texto2) {
        return texto1.equals(texto2);
    }
}
