package com.pm.calculadora5_0;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.Precision;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView resultTV, solutionTV;
    float num1 = 0.0f;
    float num2 = 0.0f;
    String operacion = "";
    String calcularDato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTV = findViewById(R.id.result_tv);
        solutionTV=findViewById(R.id.solution_tv);
    }

    public void LimpiarResultado(View view) {
        resultTV.setText("0");
        solutionTV.setText("0");
        num1 = 0.0f;
        num2 = 0.0f;
        operacion = "";
    }

    public void LimpiarSeccion(View view) {
        resultTV.setText("0");
    }

    public void BackSpace(View view) {
        calcularDato = resultTV.getText().toString();
        if(calcularDato.length()!=1){
            calcularDato = calcularDato.substring(0,calcularDato.length()-1);
            resultTV.setText(calcularDato);
            solutionTV.setText(resultTV.getText());
        }else{
            resultTV.setText("0");
            solutionTV.setText("");
        }
    }

    public void EscribirNueve(View view) {
        float valor = Float.parseFloat(resultTV.getText().toString());
        long totalPto = resultTV.getText().toString().chars().filter(ch->ch=='.').count();
        if(totalPto==1){
            resultTV.setText(resultTV.getText() + "9");
        }else if(valor==0.0f){
            resultTV.setText("9");
        }else {
            resultTV.setText(resultTV.getText() + "9");
        }
    }

    public void EscribirOcho(View view) {
        float valor = Float.parseFloat(resultTV.getText().toString());
        long totalPto = resultTV.getText().toString().chars().filter(ch->ch=='.').count();
        if(totalPto==1){
            resultTV.setText(resultTV.getText() + "8");
        }else if(valor==0.0f){
            resultTV.setText("8");
        }else {
            resultTV.setText(resultTV.getText() + "8");
        }
    }

    public void EscribirSiete(View view) {
        float valor = Float.parseFloat(resultTV.getText().toString());
        long totalPto = resultTV.getText().toString().chars().filter(ch->ch=='.').count();
        if(totalPto==1){
            resultTV.setText(resultTV.getText() + "7");
        }else if(valor==0.0f){
            resultTV.setText("7");
        }else {
            resultTV.setText(resultTV.getText() + "7");
        }
    }

    public void EscribirSeis(View view) {
        float valor = Float.parseFloat(resultTV.getText().toString());
        long totalPto = resultTV.getText().toString().chars().filter(ch->ch=='.').count();
        if(totalPto==1){
            resultTV.setText(resultTV.getText() + "6");
        }else if(valor==0.0f){
            resultTV.setText("6");
        }else {
            resultTV.setText(resultTV.getText() + "6");
        }
    }

    public void EscribirCinco(View view) {
        float valor = Float.parseFloat(resultTV.getText().toString());
        long totalPto = resultTV.getText().toString().chars().filter(ch->ch=='.').count();
        if(totalPto==1){
            resultTV.setText(resultTV.getText() + "5");
        }else if(valor==0.0f){
            resultTV.setText("5");
        }else {
            resultTV.setText(resultTV.getText() + "5");
        }
    }

    public void EscribirCuatro(View view) {
        float valor = Float.parseFloat(resultTV.getText().toString());
        long totalPto = resultTV.getText().toString().chars().filter(ch->ch=='.').count();
        if(totalPto==1){
            resultTV.setText(resultTV.getText() + "4");
        }else if(valor==0.0f){
            resultTV.setText("4");
        }else {
            resultTV.setText(resultTV.getText() + "4");
        }
    }

    public void EscribirTres(View view) {
        float valor = Float.parseFloat(resultTV.getText().toString());
        long totalPto = resultTV.getText().toString().chars().filter(ch->ch=='.').count();
        if(totalPto==1){
            resultTV.setText(resultTV.getText() + "3");
        }else if(valor==0.0f){
            resultTV.setText("3");
        }else {
            resultTV.setText(resultTV.getText() + "3");
        }
    }

    public void EscribirDos(View view) {
        float valor = Float.parseFloat(resultTV.getText().toString());
        long totalPto = resultTV.getText().toString().chars().filter(ch->ch=='.').count();
        if(totalPto==1){
            resultTV.setText(resultTV.getText() + "2");
        }else if(valor==0.0f){
            resultTV.setText("2");
        }else {
            resultTV.setText(resultTV.getText() + "2");
        }
    }

    public void EscribirUno(View view) {
        float valor = Float.parseFloat(resultTV.getText().toString());
        long totalPto = resultTV.getText().toString().chars().filter(ch->ch=='.').count();
        if(totalPto==1){
            resultTV.setText(resultTV.getText() + "1");
        }else if(valor==0.0f){
            resultTV.setText("1");
        }else {
            resultTV.setText(resultTV.getText() + "1");
        }
    }

    public void EscribirCero(View view) {
        float valor = Float.parseFloat(resultTV.getText().toString());
        long totalPto = resultTV.getText().toString().chars().filter(ch->ch=='.').count();
        if(totalPto==1){
            resultTV.setText(resultTV.getText() + "0");
        }else if(valor==0.0f){
            resultTV.setText("0");
        }else {
            resultTV.setText(resultTV.getText() + "0");
        }
    }

    public void OperarDivision(View view) {
        num1 = Float.parseFloat(resultTV.getText().toString());
        operacion ="/";
        solutionTV.setText(resultTV.getText().toString()+operacion);
        resultTV.setText("0");
    }

    public void OperarMultiplicar(View view) {
        num1 = Float.parseFloat(resultTV.getText().toString());
        operacion ="*";
        solutionTV.setText(resultTV.getText().toString()+operacion);
        resultTV.setText("0");
    }

    public void OperarRestar(View view) {
        num1 = Float.parseFloat(resultTV.getText().toString());
        operacion ="-";
        solutionTV.setText(resultTV.getText().toString()+operacion);
        resultTV.setText("0");
    }

    public void OperarSumar(View view) {
        num1 = Float.parseFloat(resultTV.getText().toString());
        operacion ="+";
        solutionTV.setText(resultTV.getText().toString()+operacion);
        resultTV.setText("0");
    }

    public void OperarPorce(View view) {
        num2 = Float.parseFloat(resultTV.getText().toString());
        num2 = num1*(num2/100);
        resultTV.setText(Reemplazo(num2+""));
    }

    public void OperarRaiz(View view) {
        num1 = Float.parseFloat(resultTV.getText().toString());
        operacion ="√";
        double aux= Math.sqrt(num1);
        solutionTV.setText("√("+Reemplazo(num1+"")+")="+Reemplazo(aux+""));
        resultTV.setText("0");
    }

    public void OperarPotencia2(View view) {
        num1 = Float.parseFloat(resultTV.getText().toString());
        double aux = Math.pow(num1,2);
        solutionTV.setText("("+Reemplazo(num1+"")+")²="+Reemplazo(aux+""));
        resultTV.setText("0");
    }

    public void OperarArmonico(View view) {
        num1 = Float.parseFloat(resultTV.getText().toString());
        double aux = 1/num1;
        solutionTV.setText("1/("+Reemplazo(num1+"")+")="+Reemplazo(aux+""));
        resultTV.setText("0");
    }

    public void OperarSigno(View view) {
        num1 = Float.parseFloat(resultTV.getText().toString());
        float aux = num1*(-1);
        solutionTV.setText(Reemplazo(aux+""));
        resultTV.setText(Reemplazo(aux+""));
    }

    public void EscribirPunto(View view) {
        num1 = Float.parseFloat(resultTV.getText().toString());
        operacion =".";
        if(num1>=-1 && num1<=1){
            solutionTV.setText("0"+operacion);
            resultTV.setText("0"+operacion);
        }else{
            solutionTV.setText(resultTV.getText().toString()+operacion);
            resultTV.setText(resultTV.getText().toString()+operacion);
        }
    }

   public String Reemplazo(String num){
        if(num.endsWith(".0")) {
            num = num.replace(".0", "");
        }
        return num;
    }

    public void OperarIgual(View view) {
        num2 = Float.parseFloat(resultTV.getText().toString());
        String segundo = Reemplazo(resultTV.getText().toString());

        if(operacion.equals("/")){
            if (num2==0.0f){
                resultTV.setText("0");
                solutionTV.setText("Error: Indefinido");
                Toast.makeText(this,"OPERACIÓN NO VÁLIDA",Toast.LENGTH_LONG).show();
            }else{
                float result = num1 / num2;
                //resultTV.setText(result+"");
                solutionTV.setText(solutionTV.getText().toString()+segundo+"="+Reemplazo(result+""));
            }
        }else if(operacion.equals("*")){
            float result =  num1 * num2;
            //resultTV.setText(result+"");
            solutionTV.setText(solutionTV.getText().toString()+segundo+"="+Reemplazo(result+""));
        }else if(operacion.equals("-")){
            float result = num1 - num2;
            //resultTV.setText(result+"");
            solutionTV.setText(solutionTV.getText().toString()+segundo+"="+Reemplazo(result+""));
        }else if(operacion.equals("+")){
            float result = num1 + num2;
            //resultTV.setText(result+"");
            solutionTV.setText(solutionTV.getText().toString()+segundo+"="+Reemplazo(result+""));
        }else{
            num1 = Float.parseFloat(resultTV.getText().toString());
            solutionTV.setText(Reemplazo(num1+""));
        }
        resultTV.setText("0");

        num1 = 0.0f;
        num2 = 0.0f;
        operacion = "";
    }
}