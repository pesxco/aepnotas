package servlet;

import FileParser.FileParser;
import entidade.Aluno;

import java.io.IOException;
import java.util.ArrayList;

public class Validacao {
    public double media;
    int i = 0;
    double total;
    double maior;
    String nome;
    double menor;
    int aprovado;
    int reprovado;

    public double mediatotal() {
        FileParser fp = new FileParser();
        total = 0;
        i = 0;
        media = 0;
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {

                media = (aluno.getNota1() + aluno.getNota2()) / 2;
                total += media;
                i += 1;
            });
            media = total / i;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return media;
    }

    public double mediaHomem() {
        FileParser fp = new FileParser();
        total = 0;
        i = 0;
        media = 0;

        try {
            ArrayList<Aluno> alunos = fp.readFile();
            alunos.forEach(aluno -> {
                if (aluno.getSexo() == 'm' || aluno.getSexo() == 'M') {
                    media = (aluno.getNota1() + aluno.getNota2()) / 2;
                    total += media;
                    i += 1;
                }
            });
            media = total / i;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return media;
    }

    public double mediaMulher() {
        FileParser fp = new FileParser();
        total = 0;
        i = 0;
        media = 0;

        try {
            ArrayList<Aluno> alunos = fp.readFile();
            alunos.forEach(aluno -> {
                if (aluno.getSexo() == 'F' || aluno.getSexo() == 'f') {
                    media = (aluno.getNota1() + aluno.getNota2()) / 2;
                    total += media;
                    i += 1;
                }
            });
            media = total / i;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return media;
    }

    public double maiorMedia(){
        FileParser fp = new FileParser();
        media = 0;
        maior = 0;
        nome = "";
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {

                media = (aluno.getNota1() + aluno.getNota2()) / 2;

                if(media > maior){
                    maior = media;
                    nome = aluno.getNome();
                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return maior;
    }

    public double maiorMediaHomem(){
        FileParser fp = new FileParser();
        media = 0;
        maior = 0;
        nome = "";
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {
                if (aluno.getSexo() == 'M' || aluno.getSexo() == 'm') {
                    media = (aluno.getNota1() + aluno.getNota2()) / 2;

                    if (media > maior) {
                        maior = media;
                        nome = aluno.getNome();
                    }
                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return maior;
    }
    public double maiorMediaMulher(){
        FileParser fp = new FileParser();
        media = 0;
        maior = 0;
        nome = "";
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {
                if (aluno.getSexo() == 'F' || aluno.getSexo() == 'f') {
                    media = (aluno.getNota1() + aluno.getNota2()) / 2;

                    if (media > maior) {
                        maior = media;
                        nome = aluno.getNome();
                    }
                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return maior;
    }

    public double menorMedia(){
        FileParser fp = new FileParser();
        media = 0;
        menor = 10;
        nome = "";
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {

                media = (aluno.getNota1() + aluno.getNota2()) / 2;

                if(media < menor){
                    menor = media;
                    nome = aluno.getNome();
                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return menor;
    }

    public double menorMediaHomem(){
        FileParser fp = new FileParser();
        media = 0;
        menor = 10;
        nome = "";
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {
                if (aluno.getSexo() == 'M' || aluno.getSexo() == 'm') {
                    media = (aluno.getNota1() + aluno.getNota2()) / 2;

                    if (media < menor) {
                        menor = media;
                        nome = aluno.getNome();
                    }
                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return menor;
    }

    public double menorMediaMulher(){
        FileParser fp = new FileParser();
        media = 0;
        menor = 10;
        nome = "";
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {
                if (aluno.getSexo() == 'F' || aluno.getSexo() == 'f') {
                    media = (aluno.getNota1() + aluno.getNota2()) / 2;

                    if (media < menor) {
                        menor = media;
                        nome = aluno.getNome();
                    }
                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return menor;
    }

    public double aprovados(){
        FileParser fp = new FileParser();
        media = 0;
        reprovado = 0;
        aprovado = 0;
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {
                media = (aluno.getNota1() + aluno.getNota2()) / 2;
                if(media >= 6.0){
                    aprovado += 1;
            }else{
                    reprovado += 1;
                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return aprovado;
    }

    public double aprovadosHomem(){
        FileParser fp = new FileParser();
        media = 0;
        reprovado = 0;
        aprovado = 0;
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {
                if (aluno.getSexo() == 'M' || aluno.getSexo() == 'm') {
                    media = (aluno.getNota1() + aluno.getNota2()) / 2;
                    if (media >= 6.0) {
                        aprovado += 1;
                    } else {
                        reprovado += 1;
                    }
                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return aprovado;
    }

    public double aprovadosMulher(){
        FileParser fp = new FileParser();
        media = 0;
        reprovado = 0;
        aprovado = 0;
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {
                if (aluno.getSexo() == 'F' || aluno.getSexo() == 'f') {
                    media = (aluno.getNota1() + aluno.getNota2()) / 2;
                    if (media >= 6.0) {
                        aprovado += 1;
                    } else {
                        reprovado += 1;
                    }
                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return aprovado;
    }

}