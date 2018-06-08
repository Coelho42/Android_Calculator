package com.example.a50445.android_calculadora;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;

public class CientificaActivity extends AppCompatActivity {

    CharSequence parcela1;
    String operacao;
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cientifica);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_basica, menu);
        return true;
    }

    final TextView textViewEcra = (TextView) findViewById(R.id.textViewEcra);

    public void buttonNum0(View b){
        ((TextView)findViewById(R.id.buttonNum0)).setText("0");
    }

    public void buttonNum1(View b){
        ((TextView)findViewById(R.id.buttonNum0)).setText("1");
    }

    public void buttonNum2(View b){
        ((TextView)findViewById(R.id.buttonNum0)).setText("2");
    }

    public void buttonNum3(View b){
        ((TextView)findViewById(R.id.buttonNum0)).setText("3");
    }

    public void buttonNum4(View b){
        ((TextView)findViewById(R.id.buttonNum0)).setText("4");
    }

    public void buttonNum5(View b){
        ((TextView)findViewById(R.id.buttonNum0)).setText("5");
    }

    public void buttonNum6(View b){
        ((TextView)findViewById(R.id.buttonNum0)).setText("6");
    }

    public void buttonNum7(View b){
        ((TextView)findViewById(R.id.buttonNum0)).setText("7");
    }

    public void buttonNum8(View b){
        ((TextView)findViewById(R.id.buttonNum0)).setText("8");
    }

    public void buttonNum9(View b){
        ((TextView)findViewById(R.id.buttonNum0)).setText("9");
    }

    public void buttonMais(View b){
        if (textViewEcra.getText().equals("")) {
        } else {
            parcela1 = textViewEcra.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
            textViewEcra.setText("");                    //Limpa o display
            operacao = "+";                         //Executa a operaçao
        }
    }

    public void buttonMenos(View b){
        if (textViewEcra.getText().equals("")) {
        } else {
            parcela1 = textViewEcra.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
            textViewEcra.setText("");                    //Limpa o display
            operacao = "-";                         //Executa a operaçao
        }
    }

    public void buttonMultiplicar(View b){
        if (textViewEcra.getText().equals("")) {
        } else {
            parcela1 = textViewEcra.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
            textViewEcra.setText("");                    //Limpa o display
            operacao = "*";                         //Executa a operaçao
        }
    }

    public void buttonDividir(View b){
        if (textViewEcra.getText().equals("")) {
        } else {
            parcela1 = textViewEcra.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
            textViewEcra.setText("");                    //Limpa o display
            operacao = "/";                         //Executa a operaçao
        }
    }

    public void buttonClear(View b){
        parcela1 = "";           //Valor do display vai para a variavel parcela1 e fica em memoria
        textViewEcra.setText("");                    //Limpa o display
        operacao = "";                         //Executa a operaçao
    }

    public void buttonRaiz(View b){
        if (textViewEcra.getText().equals("")) {
        } else {
            parcela1 = textViewEcra.getText();           //Valor do display2 vai para a variavel parcela1 e fica em memoria
            operacao = "√";                         //Executa a operaçao
        }
    }


    public void buttonElevado(View b){
        if (textViewEcra.getText().equals("")) {
        } else {
            parcela1 = textViewEcra.getText();           //Valor do display2 vai para a variavel parcela1 e fica em memoria
            operacao = "^";                         //Executa a operaçao
        }
    }

    public void buttonQuadrado(View b){
        if (textViewEcra.getText().equals("")) {
        } else {
            parcela1 = textViewEcra.getText();           //Valor do display2 vai para a variavel parcela1 e fica em memoria
            operacao = "x2";                        //Executa a operaçao
        }
    }

    public void buttonCubo(View b){
        if (textViewEcra.getText().equals("")) {
        } else {
            parcela1 = textViewEcra.getText();           //Valor do display2 vai para a variavel parcela1 e fica em memoria
            textViewEcra.setText("");                    //Limpa o display2
            operacao = "x3";                        //Executa a operaçao
        }
    }

    public void buttonVirgula(View b){
        if (textViewEcra.getText().equals("")) {
        } else {
            textViewEcra.setText(textViewEcra.getText() + ".");
        }
    }

    public void buttonIgual(View b) {
        if (operacao != "" && parcela1 != "" && textViewEcra.getText() != "") {

            //se operaçao for +
            if (operacao == "+") {
                //Converte para doubles as strings parcela1 e display e soma
                double valor1 = Double.parseDouble(parcela1.toString());
                double valor2 = Double.parseDouble(textViewEcra.getText().toString());
                resultado = valor1 + valor2;

                //Coloca o display e o resultado convertido para string
                String total = String.valueOf(resultado);
                textViewEcra.setText(valor1 + " + " + valor2 + " = " + total);
                operacao = "";
            }

            //se operaçao for -
            if (operacao == "-") {
                //Converte para doubles as strings parcela1 e display e soma
                double valor1 = Double.parseDouble(parcela1.toString());
                double valor2 = Double.parseDouble(textViewEcra.getText().toString());
                resultado = valor1 - valor2;

                //Coloca o display e o resultado convertido para string
                String total = String.valueOf(resultado);
                textViewEcra.setText(valor1 + " - " + valor2 + " = " + total);
                operacao = "";

            }

            //se operaçao for *
            if (operacao == "*") {
                //Converte para doubles as strings parcela1 e display e soma
                double valor1 = Double.parseDouble(parcela1.toString());
                double valor2 = Double.parseDouble(textViewEcra.getText().toString());
                resultado = valor1 * valor2;

                //Coloca o display e o resultado convertido para string
                String total = String.valueOf(resultado);
                textViewEcra.setText(valor1 + " * " + valor2 + " = " + total);
                operacao = "";

            }

            //se opraçao for /
            if (operacao == "/") {
                if (!textViewEcra.getText().equals("0")) {
                    //Converte para doubles as strings parcela1 e display e soma
                    double valor1 = Double.parseDouble(parcela1.toString());
                    double valor2 = Double.parseDouble(textViewEcra.getText().toString());
                    resultado = valor1 / valor2;

                    //Coloca o display e o resultado convertido para string
                    String total = String.valueOf(resultado);
                    textViewEcra.setText(valor1 + " / " + valor2 + " = " + total);
                    operacao = "";
                } else {
                    operacao = "";
                }
            }

            if (operacao == "√") {
                //Converte para doubles as strings parcela1 e display2 e soma
                double valor1 = Double.parseDouble(parcela1.toString());
                resultado = Math.sqrt(valor1);

                //Coloca o display2 e o resultado convertido para string
                String total = String.valueOf(resultado);
                textViewEcra.setText("√ " + valor1 + " = " + total);
                operacao = "";
            }

            if (operacao == "^") {
                //Converte para doubles as strings parcela1 e display2 e soma
                double valor1 = Double.parseDouble(parcela1.toString());
                double valor2 = Double.parseDouble(textViewEcra.getText().toString());
                resultado = Math.pow(valor1, valor2);

                //Coloca o display2 e o resultado convertido para string
                String total = String.valueOf(resultado);
                textViewEcra.setText(valor1 + " ^ " + valor2 + " = " + total);
                operacao = "";
            }

            if (operacao == "x2") {
                //Converte para doubles as strings parcela1 e display2 e soma
                double valor1 = Double.parseDouble(parcela1.toString());
                resultado = valor1 * valor1;

                //Coloca o display2 e o resultado convertido para string
                String total = String.valueOf(resultado);
                textViewEcra.setText(total);
                operacao = "";
            }

            if (operacao == "x3") {
                //Converte para doubles as strings parcela1 e display2 e soma
                double valor1 = Double.parseDouble(parcela1.toString());
                resultado = valor1 * valor1 * valor1;

                //Coloca o display2 e o resultado convertido para string
                String total = String.valueOf(resultado);
                textViewEcra.setText(total);
                operacao = "";
            }
        }
    }
}
