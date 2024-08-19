package modelo;

import java.time.LocalDate;
import java.util.Date;

public class Pagamento {

    private float valor;
    private LocalDate data;

    @Override
    public String toString() {
        return "Pagamento{" +
                "valor=" + valor +
                ", data=" + data +
                '}';
    }
    //classe construtora
    public Pagamento(float valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }
    //metodos get's e set's
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
