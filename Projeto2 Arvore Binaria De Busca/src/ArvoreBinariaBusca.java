import java.util.ArrayList;
import java.util.List;

public class ArvoreBinariaBusca {
    No<Palavra> raiz;
    private int totalLinhas = 0;
    private int totalPalavras = 0;

    // Inserção: busca antes de inserir para atualizar ocorrência
    public void inserir(String texto) {
        Palavra existente = buscar(texto);
        if (existente != null) {
            existente.incrementarOcorrencia();
        } else {
            raiz = inserirRec(raiz, new Palavra(texto));
        }
        totalPalavras++;
    }

    private No<Palavra> inserirRec(No<Palavra> nodo, Palavra p) {
        if (nodo == null) {
            return new No<>(p);
        }
        int cmp = p.compareTo(nodo.getDado());
        if (cmp < 0) {
            nodo.setEsq(inserirRec(nodo.getEsq(), p));
        } else if (cmp > 0) {
            nodo.setDir(inserirRec(nodo.getDir(), p));
        }
        return nodo;
    }

    // Busca exata
    public Palavra buscar(String texto) {
        return buscarRec(raiz, texto);
    }

    private Palavra buscarRec(No<Palavra> nodo, String texto) {
        if (nodo == null) return null;
        int cmp = texto.compareToIgnoreCase(nodo.getDado().getTexto());
        if (cmp < 0) return buscarRec(nodo.getEsq(), texto);
        if (cmp > 0) return buscarRec(nodo.getDir(), texto);
        return nodo.getDado();
    }

    // Busca por parte de palavra
    public List<Palavra> buscaPorParte(String parte) {
        List<Palavra> res = new ArrayList<>();
        buscaPorParteRec(raiz, parte.toLowerCase(), res);
        return res;
    }

    private void buscaPorParteRec(No<Palavra> nodo, String parte, List<Palavra> res) {
        if (nodo == null) return;
        String txt = nodo.getDado().getTexto().toLowerCase();
        if (txt.contains(parte)) {
            res.add(nodo.getDado());
        }
        buscaPorParteRec(nodo.getEsq(), parte, res);
        buscaPorParteRec(nodo.getDir(), parte, res);
    }

    // Travessias
    public void emOrdem() { emOrdemRec(raiz); }
    private void emOrdemRec(No<Palavra> nodo) {
        if (nodo != null) {
            emOrdemRec(nodo.getEsq());
            System.out.println(nodo.getDado());
            emOrdemRec(nodo.getDir());
        }
    }

    public void emOrdemReversa() { emOrdemRevRec(raiz); }
    private void emOrdemRevRec(No<Palavra> nodo) {
        if (nodo != null) {
            emOrdemRevRec(nodo.getDir());
            System.out.println(nodo.getDado());
            emOrdemRevRec(nodo.getEsq());
        }
    }

    // Estatísticas
    public void incrementaLinhas() { totalLinhas++; }
    public int getTotalLinhas() { return totalLinhas; }
    public int getTotalPalavras() { return totalPalavras; }
    public int getTotalDistintas() { return contarNos(raiz); }

    private int contarNos(No<Palavra> nodo) {
        if (nodo == null) return 0;
        return 1 + contarNos(nodo.getEsq()) + contarNos(nodo.getDir());
    }

    public double mediaCaracteres() {
        return somaCaracteres(raiz) / (double) totalPalavras;
    }

    private int somaCaracteres(No<Palavra> nodo) {
        if (nodo == null) return 0;
        return nodo.getDado().getNumeroCaracteres()
             + somaCaracteres(nodo.getEsq())
             + somaCaracteres(nodo.getDir());
    }

    public double taxaRedundancia() {
        return (1.0 - (getTotalDistintas() / (double) totalPalavras)) * 100.0;
    }

    // Função inventada (exemplo): lista top 10 palavras por ocorrência
    public void funcaoInventada() {
        List<Palavra> todas = new ArrayList<>();
        coleta(raiz, todas);
        todas.sort((a,b) -> b.getOcorrencias() - a.getOcorrencias());
        System.out.println("=== Top 10 mais frequentes ===");
        for (int i = 0; i < Math.min(10, todas.size()); i++) {
            System.out.printf("%dº %s\n", i+1, todas.get(i));
        }
    }

    private void coleta(No<Palavra> nodo, List<Palavra> lista) {
        if (nodo == null) return;
        lista.add(nodo.getDado());
        coleta(nodo.getEsq(), lista);
        coleta(nodo.getDir(), lista);
    }
}

