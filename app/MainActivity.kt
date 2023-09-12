class MainActivity {

    import android.os.Bundle
    import androidx.appcompat.app.AppCompatActivity
    import kotlinx.android.synthetic.main.activity_main.* // Importo las vistas desde el XML

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Configurar el evento clic del botón
            buttonCompare.setOnClickListener {
                val text1 = editText1.text.toString()
                val text2 = editText2.text.toString()

                // Comparar los textos y mostrar el resultado en textViewResult *
                if (text1 == text2) {
                    textViewResult.text = "Los textos son iguales."
                } else {
                    textViewResult.text = "Los textos no son iguales."
                }
            }
        }
    }

}