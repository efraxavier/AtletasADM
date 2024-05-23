// SeniorFragment.java
package natacao;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SeniorFragment extends Fragment {
    private EditText nomeEditText;
    private EditText dataNascimentoEditText;
    private EditText bairroEditText;
    private CheckBox problemasCardiacosCheckBox;
    private Button cadastrarButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_senior, container, false);

        nomeEditText = view.findViewById(R.id.nome_edit_text);
        dataNascimentoEditText = view.findViewById(R.id.data_nascimento_edit_text);
        bairroEditText = view.findViewById(R.id.bairro_edit_text);
        problemasCardiacosCheckBox = view.findViewById(R.id.problemas_cardiacos_checkbox);
        cadastrarButton = view.findViewById(R.id.cadastrar_button);

        cadastrarButton.setOnClickListener(v -> {
            String nome = nomeEditText.getText().toString();
            String dataNascimento = dataNascimentoEditText.getText().toString();
            String bairro = bairroEditText.getText().toString();
            boolean problemasCardiacos = problemasCardiacosCheckBox.isChecked();

            AtletaSenior atletaSenior = new AtletaSenior(nome, dataNascimento, bairro, problemasCardiacos);

            Toast.makeText(view.getContext(), atletaSenior.toString(), Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
