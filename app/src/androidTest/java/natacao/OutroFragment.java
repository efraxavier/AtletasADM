// OutroFragment.java
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

import com.example.atletasadm.R;

import models.AtletaOutro;


public class OutroFragment extends Fragment {
    private EditText nomeEditText;
    private EditText dataNascimentoEditText;
    private EditText bairroEditText;
    private EditText academiaEditText;
    private EditText recordeEditText;
    private Button cadastrarButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_outro, container, false);

        nomeEditText = view.findViewById(R.id.nome_edit_text);
        dataNascimentoEditText = view.findViewById(R.id.data_nascimento_edit_text);
        bairroEditText = view.findViewById(R.id.bairro_edit_text);
        academiaEditText = view.findViewById(R.id.academia_edit_text);
        recordeEditText = view.findViewById(R.id.recorde_edit_text);
        cadastrarButton = view.findViewById(R.id.cadastrar_button);

        cadastrarButton.setOnClickListener(v -> {
            String nome = nomeEditText.getText().toString();
            String dataNascimento = dataNascimentoEditText.getText().toString();
            String bairro = bairroEditText.getText().toString();
            String academia = academiaEditText.getText().toString();
            float recorde = Float.parseFloat(recordeEditText.getText().toString());

            AtletaOutro atletaOutro = new AtletaOutro(nome, dataNascimento, bairro, academia, recorde);

            Toast.makeText(view.getContext(), atletaOutro.toString(), Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
