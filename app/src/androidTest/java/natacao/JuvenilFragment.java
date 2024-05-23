// JuvenilFragment.java
package natacao;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class JuvenilFragment extends Fragment {
    private EditText nomeEditText;
    private EditText dataNascimentoEditText;
    private EditText bairroEditText;
    private EditText anosDePraticaEditText;
    private Button cadastrarButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_juvenil, container, false);

        nomeEditText = view.findViewById(R.id.nome_edit_text);
        dataNascimentoEditText = view.findViewById(R.id.data_nascimento_edit_text);
        bairroEditText = view.findViewById(R.id.bairro_edit_text);
        anosDePraticaEditText = view.findViewById(R.id.anos_de_pratica_edit_text);
        cadastrarButton = view.findViewById(R.id.cadastrar_button);

        cadastrarButton.setOnClickListener(v -> {
            String nome = nomeEditText.getText().toString();
            String dataNascimento = dataNascimentoEditText.getText().toString();
            String bairro = bairroEditText.getText().toString();
            int anosDePratica = Integer.parseInt(anosDePraticaEditText.getText().toString());

            AtletaJuvenil atletaJuvenil = new AtletaJuvenil(nome, dataNascimento, bairro, anosDePratica);

            Toast.makeText(view.getContext(), atletaJuvenil.toString(), Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
