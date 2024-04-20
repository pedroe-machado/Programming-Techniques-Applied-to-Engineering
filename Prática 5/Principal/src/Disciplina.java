import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Disciplina {
    
    private String codigo;
    private ArrayList<Aluno> diarioAlunos;

    public Disciplina(String codigo){
        this.codigo = codigo;
        diarioAlunos = new ArrayList<>();
    }

    public String getCodigo(){return codigo;}

    public List<Aluno> getListaAlunos(){
        return Collections.unmodifiableList(diarioAlunos);
    }

    public void adicionarAluno(Aluno aluno){
        diarioAlunos.add(aluno);
    }

    public void ordenarDiario(){
        diarioAlunos.sort(getComparador());
    }

    private Comparator<Aluno> getComparador(){
        Comparator<Aluno> comparador = new Comparator<Aluno>() {
            @Override
            public int compare(Aluno a1, Aluno a2){
                return a2.getNota() - a1.getNota();
            }
        };
        return comparador;
    }

}
