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
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // Criação do Button Java usando o método da classe super findViewById()
        final Button buttonNum0 = (Button) findViewById(R.id.buttonNum0);
        final Button buttonNum1 = (Button) findViewById(R.id.buttonNum1);
        final Button buttonNum2 = (Button) findViewById(R.id.buttonNum2);
        final Button buttonNum3 = (Button) findViewById(R.id.buttonNum3);
        final Button buttonNum4 = (Button) findViewById(R.id.buttonNum4);
        final Button buttonNum5 = (Button) findViewById(R.id.buttonNum5);
        final Button buttonNum6 = (Button) findViewById(R.id.buttonNum6);
        final Button buttonNum7 = (Button) findViewById(R.id.buttonNum7);
        final Button buttonNum8 = (Button) findViewById(R.id.buttonNum8);
        final Button buttonNum9 = (Button) findViewById(R.id.buttonNum9);
        final Button buttonIgual = (Button) findViewById(R.id.buttonIgual);
        final Button buttonMais = (Button) findViewById(R.id.buttonMais);
        final Button buttonMenos = (Button) findViewById(R.id.buttonMenos);
        final Button buttonMultiplicar = (Button) findViewById(R.id.buttonMultiplicar);
        final Button buttonDividir = (Button) findViewById(R.id.buttonDividir);
        final Button buttonRaiz = (Button) findViewById(R.id.buttonRaiz);
        final Button buttonVirgula = (Button) findViewById(R.id.buttonVirgula);
        final Button buttonClear = (Button) findViewById(R.id.buttonClear);
        final Button buttonElevado = (Button) findViewById(R.id.buttonElevado);
        final Button buttonCos = (Button) findViewById(R.id.buttonCos);
        final Button buttonSen = (Button) findViewById(R.id.buttonSen);
        final Button buttonTan = (Button) findViewById(R.id.buttonTan);
        final Button buttonQuadrado = (Button) findViewById(R.id.buttonQuadrado);
        final Button buttonCubo = (Button) findViewById(R.id.buttonCubo);
        final TextView textViewEcra = (TextView) findViewById(R.id.textViewEcra);


        // Ação dos Butões
        buttonNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEcra.setText(textViewEcra.getText() + "0");
            }
        });

        buttonNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEcra.setText(textViewEcra.getText() + "1");
            }
        });

        buttonNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEcra.setText(textViewEcra.getText() + "2");
            }
        });

        buttonNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEcra.setText(textViewEcra.getText() + "3");
            }
        });

        buttonNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEcra.setText(textViewEcra.getText() + "4");
            }
        });

        buttonNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEcra.setText(textViewEcra.getText() + "5");
            }
        });

        buttonNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEcra.setText(textViewEcra.getText() + "6");
            }
        });

        buttonNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEcra.setText(textViewEcra.getText() + "7");
            }
        });

        buttonNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEcra.setText(textViewEcra.getText() + "8");
            }
        });

        buttonNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEcra.setText(textViewEcra.getText() + "9");
            }
        });

        buttonMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewEcra.getText().equals("")) {
                } else {
                    parcela1 = textViewEcra.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    textViewEcra.setText("");                    //Limpa o display
                    operacao = "+";                         //Executa a operaçao
                }
            }
        });
        buttonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewEcra.getText().equals("")) {
                } else {
                    parcela1 = textViewEcra.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    textViewEcra.setText("");                    //Limpa o display
                    operacao = "-";                         //Executa a operaçao
                }
            }
        });
        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewEcra.getText().equals("")) {
                } else {
                    parcela1 = textViewEcra.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    textViewEcra.setText("");                    //Limpa o display
                    operacao = "*";                         //Executa a operaçao
                }
            }
        });
        buttonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewEcra.getText().equals("")) {
                } else {
                    parcela1 = textViewEcra.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    textViewEcra.setText("");                    //Limpa o display
                    operacao = "/";                         //Executa a operaçao
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parcela1 = "";           //Valor do display vai para a variavel parcela1 e fica em memoria
                textViewEcra.setText("");                    //Limpa o display
                operacao = "";                         //Executa a operaçao
            }
        });
        buttonRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewEcra.getText().equals("")) {
                } else {
                    parcela1 = textViewEcra.getText();           //Valor do display2 vai para a variavel parcela1 e fica em memoria
                    operacao = "√";                         //Executa a operaçao
                }
            }
        });
        buttonElevado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewEcra.getText().equals("")) {
                } else {
                    parcela1 = textViewEcra.getText();           //Valor do display2 vai para a variavel parcela1 e fica em memoria
                    operacao = "^";                         //Executa a operaçao
                }
            }
        });

        buttonQuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewEcra.getText().equals("")) {
                } else {
                    parcela1 = textViewEcra.getText();           //Valor do display2 vai para a variavel parcela1 e fica em memoria
                    operacao = "x2";                        //Executa a operaçao
                }
            }
        });

        buttonCubo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewEcra.getText().equals("")) {
                } else {
                    parcela1 = textViewEcra.getText();           //Valor do display2 vai para a variavel parcela1 e fica em memoria
                    textViewEcra.setText("");                    //Limpa o display2
                    operacao = "x3";                        //Executa a operaçao
                }
            }
        });

        buttonVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewEcra.getText().equals("")) {
                } else {
                    textViewEcra.setText(textViewEcra.getText() + ".");
                }
            }
        });

        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        });

    }
    public void button0(View b){
        ((TextView)findViewById(R.id.buttonNum0)).setText("0");
    }
}
