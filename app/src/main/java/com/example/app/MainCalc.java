package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class MainCalc extends AppCompatActivity implements View.OnClickListener {

    TextView calcTextView;
    //boolean numAtual = false, decimal = false;
    float num1 = 0, num2 = 0, resultado;
    int[] casasDecimais = {1, 1};
    char operador;
    boolean numAtual = false, decimal = false;
    //int posPonto;
    //String[] idButtons = {"calcButton_0","calcButton_1","calcButton_2","calcButton_3","calcButton_4","calcButton_5","calcButton_6","calcButton_7","calcButton_8","calcButton_9","calcButton_minus","calcButton_sum","calcButton_divide","calcButton_result","calcButton_C","calcButton_multiply"};
    //Button[] buttons = new Button[16];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_gamer);
        /*viewRes = (TextView) findViewById(R.id.viewRes);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        Button btnSoma = (Button) findViewById(R.id.btnSomar);
        // setText() -> alterar via java o conteudo da view
        //viewRes.setText("Alterado via JAVA");
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int num1  = n1.getText();
                int num1  = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int soma = num1+num2;
                viewRes.setText(num1+"+"+num2+" = "+soma);
                Toast.makeText(MainActivity.this,"ambasing in " +soma+ " seconds." , Toast.LENGTH_SHORT).show();
            }
        });*/
        /*
        calcTextView = (TextView) findViewById(R.id.calcTextView);
        findViewById(R.id.calcButton_C).setOnClickListener(this);
        findViewById(R.id.calcButton_dot).setOnClickListener(this);
        findViewById(R.id.calcButton_result).setOnClickListener(this);
        findViewById(R.id.calcButton_sum).setOnClickListener(this);
        findViewById(R.id.calcButton_minus).setOnClickListener(this);
        findViewById(R.id.calcButton_multiply).setOnClickListener(this);
        findViewById(R.id.calcButton_divide).setOnClickListener(this);
        findViewById(R.id.calcButton_0).setOnClickListener(this);
        findViewById(R.id.calcButton_1).setOnClickListener(this);
        findViewById(R.id.calcButton_2).setOnClickListener(this);
        findViewById(R.id.calcButton_3).setOnClickListener(this);
        findViewById(R.id.calcButton_4).setOnClickListener(this);
        findViewById(R.id.calcButton_5).setOnClickListener(this);
        findViewById(R.id.calcButton_6).setOnClickListener(this);
        findViewById(R.id.calcButton_7).setOnClickListener(this);
        findViewById(R.id.calcButton_8).setOnClickListener(this);
        findViewById(R.id.calcButton_9).setOnClickListener(this);
    */
    }

    /*
    private void execCalc(int id){
        switch(id){
            case R.id.calcButton_result:
                calcTextView.setText(Float.toString(calcular()));
                break;
            case R.id.calcButton_sum:
                setOperator('+');
                break;
            case R.id.calcButton_minus:
                setOperator('-');
                break;
            case R.id.calcButton_multiply:
                setOperator('*');
                break;
            case R.id.calcButton_divide:
                setOperator('/');
                break;
            case R.id.calcButton_C:
                clearNum();
                break;
            case R.id.calcButton_dot:
                decimal = true;
                break;
            case R.id.calcButton_0:
                add(0);
                break;
            case R.id.calcButton_1:
                add(1);
                break;
            case R.id.calcButton_2:
                add(2);
                break;
            case R.id.calcButton_3:
                add(3);
                break;
            case R.id.calcButton_4:
                add(4);
                break;
            case R.id.calcButton_5:
                add(5);
                break;
            case R.id.calcButton_6:
                add(6);
                break;
            case R.id.calcButton_7:
                add(7);
                break;
            case R.id.calcButton_8:
                add(8);
                break;
            case R.id.calcButton_9:
                add(9);
                break;
            default:
                return;
        }
    }
*/
    private void clearNum(){
        decimal = false;
        numAtual = false;
        num1 = 0;
        num2 = 0;
        casasDecimais[0] = 1;
        casasDecimais[1] = 1;
        calcTextView.setText("0");
    }

    private void setOperator(char op){
        operador = op;
        numAtual=numAtual==false;
        decimal = false;
    }

    private void add(int num){
        if(!numAtual) {
            if(!decimal)
                num1 = num1 * 10 + num;
            else
                num1 = num1 + num/(10^casasDecimais[0]++);
            calcTextView.setText(Float.toString(num1));
            Toast.makeText(MainCalc.this, casasDecimais[0], Toast.LENGTH_SHORT).show();
        }else {
                if(!decimal)
                    num2 = num2 * 10 + num;
                else
                    num2 = num2 + num/(10^casasDecimais[1]++);
            calcTextView.setText(Float.toString(num1)+operador+Float.toString(num2));
        }
    }

    private float calcular(){
        DecimalFormat formato = new DecimalFormat("#.##");
        switch(operador){
            case '+':
                resultado = num1+num2;
                break;
            case '-':
                resultado = num1-num2;
                break;
            case '*':
                resultado = num1*num2;
                break;
            case '/':
                resultado = num1/num2;
                break;
            default:
                resultado = 0;
        }
        clearNum();
        return Float.valueOf(formato.format(resultado));
    }

    @Override

    public void onClick(View view) {
       // execCalc(view.getId());
        /*
        if(view == btnSoma)
        if(view.getId() == R.id.btnSoma)
            codigo()
        if(view == btnSub)
            codigo()
        */
    }

    /*
    private float calcular(){
        int operadorAnt = 0, operadorAtual = 0, inicioConta, fimConta;
        float resultado = 0;
        boolean altraPrioridade = false;
        for(int i=0;i<calc.length();i++){
            char numAtual = calc.charAt(i);
            if(checkOperador(numAtual)) {
                if(operadorAtual==0 || operadorAnt == operadorAtual)
                    operadorAnt = i;
                operadorAtual = i;
                if(numAtual=='*'||numAtual=='/'){
                    inicioConta = operadorAnt+1;
                    char percorre = calc.charAt(i+1);
                    while (!checkOperador(percorre)){
                        fimConta = percorre++;
                    }
                    fimConta-=1;
                    if(numAtual=='*')
                        resultado = (Float) String.sub
                }
            }
        }
    }

    private boolean checkOperador(char letra){
        if(letra=='+'||letra=='/'||letra=='*'||letra=='-')
            return true;
        return false;
    }

     */
    /*
    private boolean isNumber(String num){
        if(Float.parseFloat(num)<=Integer.MAX_VALUE)
            return true;
        return false;
    }
    private float calcular(){
        char atual;
        for(int i=0;i<this.calc.length();i++){
            atual = calc.charAt(i);
            if(atual=='+' || atual=='-' || atual == '/' || atual == '*') {
                numAtual = !numAtual ? true : false;
                continue;
            }
            if(atual=='.'){
                posPonto = i;
                decimal = true;
                continue;
            }
            if(!decimal){
                if(i==0){
                    fazerOperacao(Float.parseFloat(String.valueOf(atual)));
                }
            }else {
                fazerOperacao(Float.parseFloat(String.valueOf(calc.charAt(i + 1))) / (10^1));
            }
        }
    }

    private void fazerOperacao(float num){
        if(!numAtual)
            num1+=num;
        else
            num2+=num;
    }
    */
}
