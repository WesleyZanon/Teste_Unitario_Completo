package PackageDefault;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Perfil {
    private boolean pagamentoAtivo;
    private List<String> cursos;

    public Perfil(boolean pagamentoAtivo) {
        this.pagamentoAtivo = pagamentoAtivo;
        this.cursos = new ArrayList<>();
       
    }

    public String verificarPagamento() {
        if (pagamentoAtivo) {
            this.cursos.add("Estrutura de Dados");
            this.cursos.add("Processamento de Sinais");
            this.cursos.add("DevOps e QA");
        	return "Cursos liberados";
            
        } else {
            return "Pagamento pendente. Realize o pagamento para acessar os cursos.";
            
        }
    }
    
    public List<String> visualizarCursos(){
    	if (pagamentoAtivo) {
            return Collections.unmodifiableList(cursos);
            
        } else {
        	cursos.clear();
        	return cursos;
        	
        }
    	
    }
    
    public int cursosQuantidade() {
    	if(pagamentoAtivo) {
    		return cursos.size();
    		
    	}else {
    		return 0;
    		
    	}
    	
    }
    
}
