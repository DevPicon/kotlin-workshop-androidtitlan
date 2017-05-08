package pe.devpicon.android.kotlinworkshopapp.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import pe.devpicon.android.kotlinworkshopapp.R;
import pe.devpicon.android.kotlinworkshopapp.mvp.model.CraftModel;
import pe.devpicon.android.kotlinworkshopapp.mvp.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView {

    MainPresenter mainPresenter;
    TextView txtHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHello = (TextView) findViewById(R.id.txt_hello);

        mainPresenter = new MainPresenter();
        mainPresenter.setView(this);
        mainPresenter.loadCrafts();
    }


    @Override
    public void showCrafts(@NotNull List<CraftModel> list) {
        txtHello.setText("Llegaron " + list.size());
    }

    @Override
    public void showErrorMessage() {
        txtHello.setText("Ocurrió un error");
    }

    @Override
    public void showEmptyList() {
        txtHello.setText("Mostraré la lista vacía");
    }
}
