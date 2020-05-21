package servlet;

import FileParser.FileParser;
import entidade.Aluno;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(
        name = "ListaAluno",
        urlPatterns = {"/lista-aluno"}
)

public class ListaAluno extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            FileParser fp = new FileParser();
            PrintWriter out = resp.getWriter();

            try {
                ArrayList<Aluno> alunos = fp.readFile();
                Validacao v = new Validacao();
                alunos.forEach(aluno -> {

                    out.println("<html>");
                    out.println("   <head>");
                    out.println("       <title>Contatos</title>");
                    out.println("   </head>");
                    out.println("   <body>");
                    out.println("Aluno: " + aluno.getNome());
                    out.println("Sexo: " + aluno.getSexo());
                    out.println("Nota 1: " + aluno.getNota1());
                    out.println("Nota 2: " + aluno.getNota2());
                    out.println("<br>");
                    out.println("</body>");
                    out.println("</html>");
                });
                out.println("<html>");
                out.println("<body>");
                out.println("<br>Media das notas : " + v.mediatotal());
                out.println("</body>");
                out.println("</html>");

                out.println("<html>");
                out.println("<body>");
                out.println("<br>Média das notas dos homens: " + v.mediaHomem());
                out.println("</body>");
                out.println("</html>");

                out.println("<html>");
                out.println("<body>");
                out.println("<br>Média das notas das mulheres: " + v.mediaMulher());
                out.println("</body>");
                out.println("</html>");

                out.println("<html>");
                out.println("<body>");
                out.println("<br>Maior: " + v.maiorMedia() + "  Nome: " + v.nome);
                out.println("</body>");
                out.println("</html>");

                out.println("<html>");
                out.println("<body>");
                out.println("<br>Maior media masculino: " + v.maiorMediaHomem() + "  Nome: " + v.nome);
                out.println("</body>");
                out.println("</html>");

                out.println("<html>");
                out.println("<body>");
                out.println("<br>Maior media feminino: " + v.maiorMediaMulher() + "  Nome: " + v.nome);
                out.println("</body>");
                out.println("</html>");

                out.println("<html>");
                out.println("<body>");
                out.println("<br>Menor media: " + v.menorMedia() + "  Nome: " + v.nome);
                out.println("</body>");
                out.println("</html>");

                out.println("<html>");
                out.println("<body>");
                out.println("<br>Menor media do Homem: " + v.menorMediaHomem() + "  Nome: " + v.nome);
                out.println("</body>");
                out.println("</html>");

                out.println("<html>");
                out.println("<body>");
                out.println("<br>Menor media da Mulher: " + v.menorMediaMulher() + "  Nome: " + v.nome);
                out.println("</body>");
                out.println("</html>");

                out.println("<html>");
                out.println("<body>");
                out.println("<br>Quantidade de alunos aprovados: " + v.aprovados() + "  Reprovados: " + v.reprovado);
                out.println("</body>");
                out.println("</html>");

                out.println("<html>");
                out.println("<body>");
                out.println("<br>Quantidade de alunos Homens aprovados: " + v.aprovadosHomem() + "  Reprovados: " + v.reprovado);
                out.println("</body>");
                out.println("</html>");

                out.println("<html>");
                out.println("<body>");
                out.println("<br>Quantidade de alunos Mulheres aprovados: " + v.aprovadosMulher() + "  Reprovados: " + v.reprovado);
                out.println("</body>");
                out.println("</html>");

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

