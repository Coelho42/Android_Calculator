package com.example.a50445.android_calculadora;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CharSequence parcela1;
    String operacao;
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonNum0(View b){
        ((TextView)findViewById(R.id.textViewEcra)).setText(((TextView)findViewById(R.id.textViewEcra)).getText() + "0");
    }

    public void buttonNum1(View b){
        ((TextView)findViewById(R.id.textViewEcra)).setText(((TextView)findViewById(R.id.textViewEcra)).getText() + "1");
    }

    public void buttonNum2(View b){
        ((TextView)findViewById(R.id.textViewEcra)).setText(((TextView)findViewById(R.id.textViewEcra)).getText() + "2");
    }

    public void buttonNum3(View b){
        ((TextView)findViewById(R.id.textViewEcra)).setText(((TextView)findViewById(R.id.textViewEcra)).getText() + "3");
    }

    public void buttonNum4(View b){
        ((TextView)findViewById(R.id.textViewEcra)).setText(((TextView)findViewById(R.id.textViewEcra)).getText() + "4");
    }

    public void buttonNum5(View b){
        ((TextView)findViewById(R.id.textViewEcra)).setText(((TextView)findViewById(R.id.textViewEcra)).getText() + "5");
    }

    public void buttonNum6(View b){
        ((TextView)findViewById(R.id.textViewEcra)).setText(((TextView)findViewById(R.id.textViewEcra)).getText() + "6");
    }

    public void buttonNum7(View b){
        ((TextView)findViewById(R.id.textViewEcra)).setText(((TextView)findViewById(R.id.textViewEcra)).getText() + "7");
    }

    public void buttonNum8(View b){
        ((TextView)findViewById(R.id.textViewEcra)).setText(((TextView)findViewById(R.id.textViewEcra)).getText() + "8");
    }

    public void buttonNum9(View b){
        ((TextView)findViewById(R.id.textViewEcra)).setText(((TextView)findViewById(R.id.textViewEcra)).getText() + "9");
    }

    public void buttonMais(View b){
        if (((TextView)findViewById(R.id.textViewEcra)).getText().equals("")) {
        } else {
            do {
                parcela1 = ((TextView) findViewById(R.id.textViewEcra)).getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                ((TextView) findViewById(R.id.textViewEcra)).setText("");                    //Limpa o display
                resultado = Double.parseDouble(parcela1.toString()) + Double.parseDouble(((TextView) findViewById(R.id.textViewEcra)).getText().toString());
                operacao = "+";                         //Executa a operaçao
            }while(operacao != "+");
        }
    }

    public void buttonMenos(View b){
        if (((TextView)findViewById(R.id.textViewEcra)).getText().equals("")) {
        } else {
            parcela1 = ((TextView)findViewById(R.id.textViewEcra)).getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
            ((TextView)findViewById(R.id.textViewEcra)).setText("");                    //Limpa o display
            operacao = "-";                         //Executa a operaçao
        }
    }

    public void buttonMultiplicar(View b){
        if (((TextView)findViewById(R.id.textViewEcra)).getText().equals("")) {
        } else {
            parcela1 = ((TextView)findViewById(R.id.textViewEcra)).getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
            ((TextView)findViewById(R.id.textViewEcra)).setText("");                    //Limpa o display
            operacao = "*";                         //Executa a operaçao
        }
    }

    public void buttonDividir(View b){
        if (((TextView)findViewById(R.id.textViewEcra)).getText().equals("")) {
        } else {
            parcela1 = ((TextView)findViewById(R.id.textViewEcra)).getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
            ((TextView)findViewById(R.id.textViewEcra)).setText("");                    //Limpa o display
            operacao = "/";                         //Executa a operaçao
        }
    }

    public void buttonClear(View b){
        parcela1 = "";           //Valor do display vai para a variavel parcela1 e fica em memoria
        ((TextView)findViewById(R.id.textViewEcra)).setText("");                    //Limpa o display
        operacao = "";                         //Executa a operaçao
    }

    public void buttonRaiz(View b){
        if (((TextView)findViewById(R.id.textViewEcra)).getText().equals("")) {
        } else {
            parcela1 = ((TextView)findViewById(R.id.textViewEcra)).getText();           //Valor do display2 vai para a variavel parcela1 e fica em memoria
            operacao = "√";                         //Executa a operaçao
        }
    }


    public void buttonElevado(View b){
        if (((TextView)findViewById(R.id.textViewEcra)).getText().equals("")) {
        } else {
            parcela1 = ((TextView)findViewById(R.id.textViewEcra)).getText();           //Valor do display2 vai para a variavel parcela1 e fica em memoria
            operacao = "^";                         //Executa a operaçao
        }
    }

    public void buttonVirgula(View b){
        if (((TextView)findViewById(R.id.textViewEcra)).getText().equals("")) {
        } else {
            ((TextView)findViewById(R.id.textViewEcra)).setText(((TextView)findViewById(R.id.textViewEcra)).getText() + ".");
        }
    }

    public void buttonIgual(View b){
        if (operacao != "" && parcela1 != "" && ((TextView)findViewById(R.id.textViewEcra)).getText() != "") {

            //se operaçao for +
            if (operacao == "+") {
                //Coloca o display e o resultado convertido para string
                String total = String.valueOf(resultado);
                ((TextView)findViewById(R.id.textViewEcra)).setText(total);
                operacao = "";
            }

            //se operaçao for -
            if (operacao == "-") {
                //Converte para doubles as strings parcela1 e display e soma
                double valor1 = Double.parseDouble(parcela1.toString());
                double valor2 = Double.parseDouble(((TextView)findViewById(R.id.textViewEcra)).getText().toString());
                resultado = valor1 - valor2;

                //Coloca o display e o resultado convertido para string
                String total = String.valueOf(resultado);
                ((TextView)findViewById(R.id.textViewEcra)).setText(valor1 + " - " + valor2 + " = " + total);
                operacao = "";

            }

            //se operaçao for *
            if (operacao == "*") {
                //Converte para doubles as strings parcela1 e display e soma
                double valor1 = Double.parseDouble(parcela1.toString());
                double valor2 = Double.parseDouble(((TextView)findViewById(R.id.textViewEcra)).getText().toString());
                resultado = valor1 * valor2;

                //Coloca o display e o resultado convertido para string
                String total = String.valueOf(resultado);
                ((TextView)findViewById(R.id.textViewEcra)).setText(valor1 + " * " + valor2 + " = " + total);
                operacao = "";

            }

            //se opraçao for /
            if (operacao == "/") {
                if (!((TextView)findViewById(R.id.textViewEcra)).getText().equals("0")) {
                    //Converte para doubles as strings parcela1 e display e soma
                    double valor1 = Double.parseDouble(parcela1.toString());
                    double valor2 = Double.parseDouble(((TextView)findViewById(R.id.textViewEcra)).getText().toString());
                    resultado = valor1 / valor2;

                    //Coloca o display e o resultado convertido para string
                    String total = String.valueOf(resultado);
                    ((TextView)findViewById(R.id.textViewEcra)).setText(valor1 + " / " + valor2 + " = " + total);
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
                ((TextView)findViewById(R.id.textViewEcra)).setText("√ " + valor1 + " = " + total);
                operacao = "";
            }

            if (operacao == "^") {
                //Converte para doubles as strings parcela1 e display2 e soma
                double valor1 = Double.parseDouble(parcela1.toString());
                double valor2 = Double.parseDouble(((TextView)findViewById(R.id.textViewEcra)).getText().toString());
                resultado = Math.pow(valor1, valor2);

                //Coloca o display2 e o resultado convertido para string
                String total = String.valueOf(resultado);
                ((TextView)findViewById(R.id.textViewEcra)).setText(valor1 + " ^ " + valor2 + " = " + total);
                operacao = "";
            }
        }
    }
}
