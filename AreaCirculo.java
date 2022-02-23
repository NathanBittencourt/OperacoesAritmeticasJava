package operacoes;

public class AreaCirculo {
    
    private float raio;

    public AreaCirculo(float r) {
        this.raio = r;
    }

    public float Calcule() {
        return (float) (this.raio * this.raio * 3.14);
    }
}
