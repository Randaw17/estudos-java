public class Veiculo(){
    private int ano;
    private String modelo, marca;

    public void setAno (int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }

    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }

    public void setMarca (String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }

    public exibirDados(){
        System.out.println("Ano: "+ano);
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
    }
}
do{
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Digite um valor Valido!\n");
    opcao = ler.nextInt();

}while(opcao != 3);