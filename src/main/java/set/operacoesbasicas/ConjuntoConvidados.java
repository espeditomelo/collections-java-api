package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> convidados;

    public ConjuntoConvidados(){
        this.convidados = new HashSet<>();
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void removerConvidadoPorCodigoConvite(String codigoConvite){
        Convidado convidado = null;
        if(!convidados.isEmpty()){
            if (!codigoConvite.isEmpty()){
                for(Convidado c : convidados){
                    if(c.getCodigoConvite().equals(codigoConvite)){
                        convidado = c;
                        break;
                    }
                }
            }
            convidados.remove(convidado);
        }
    }

    public Set<Convidado> listarConvidados(){
        return convidados;
    }

    public void adicionarConvidado(String nome, String codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }


}
