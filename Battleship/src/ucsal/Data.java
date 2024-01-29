package ucsal;
import java.util.Scanner;

public class Data {
	Scanner s = new Scanner(System.in);
	
	
	public static int[][] table(){
		int[][] table = new int[10][10];
		
		
		for(int i = 0; i<10; i++) {
			for(int j =0; j<10; j++) {
				table[i][j] = 0;
			}
		}
		
		
		return table;
		
	}
	
	public static boolean verificarPosicoesLivres(int[][] tabuleiro, int x1, int y1, int x2, int y2) {
        for (int i = Math.min(x1, x2); i <= Math.max(x1, x2); i++) {
            for (int j = Math.min(y1, y2); j <= Math.max(y1, y2); j++) {
                if (tabuleiro[i][j] != 0) { 
                    return false; 
                }
            }
        }
        return true; 
    }
	
	
	
	public static int[][] porta_aviao(int[][] table) {
	    Scanner s = new Scanner(System.in);
	    boolean posicaoValida = false;

	    while (!posicaoValida) {
	        System.out.println("Digite a coluna em que a parte inicial do seu porta aviao será posicionada (lembrando que as colunas vão de 0 a 9): ");
	        int y1 = s.nextInt();

	        System.out.println("Digite a linha em que a parte inicial do seu porta aviao será posicionada (lembrando que as linhas vão de 0 a 9): ");
	        int x1 = s.nextInt();

	        System.out.println("Digite a coluna em que a parte final do seu porta aviao será posicionada (lembrando que as colunas vão de 0 a 9): ");
	        int y2 = s.nextInt();

	        System.out.println("Digite a linha em que a parte final do seu porta aviao será posicionada (lembrando que as linhas vão de 0 a 9): ");
	        int x2 = s.nextInt();

	        int tamanhoNavio = 5; // Tamanho do navio

	        if (x1 == x2 && Math.abs(y1 - y2) == tamanhoNavio - 1) { // Posicionamento vertical
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirY = (y1 < y2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1][y1 + i * dirY] = 5; // 5 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else if (y1 == y2 && Math.abs(x1 - x2) == tamanhoNavio - 1) { // Posicionamento horizontal
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirX = (x1 < x2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1 + i * dirX][y1] = 5; // 5 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2) && Math.abs(x1 - x2) == tamanhoNavio - 1) { // Posicionamento diagonal
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirX = (x1 < x2) ? 1 : -1;
	                int dirY = (y1 < y2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1 + i * dirX][y1 + i * dirY] = 5; // 5 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else {
	            System.out.println("Posicionamento inválido para o navio. Tente novamente.");
	        }
	    }
	    System.out.println("navio posicionado com sucesso");

	    return table;
	}
		
	public static int[][] navio_tanque (int[][]table) {
		
		
	    Scanner s = new Scanner(System.in);
	    boolean posicaoValida = false;

	    while (!posicaoValida) {
	        System.out.println("Digite a coluna em que a parte inicial do seu navio tanque será posicionada (lembrando que as colunas vão de 0 a 9): ");
	        int y1 = s.nextInt();

	        System.out.println("Digite a linha em que a parte inicial do seu navio tanque será posicionada (lembrando que as linhas vão de 0 a 9): ");
	        int x1 = s.nextInt();

	        System.out.println("Digite a coluna em que a parte final do seu navio tanque será posicionada (lembrando que as colunas vão de 0 a 9): ");
	        int y2 = s.nextInt();

	        System.out.println("Digite a linha em que a parte final do seu navio tanque será posicionada (lembrando que as linhas vão de 0 a 9): ");
	        int x2 = s.nextInt();

	        int tamanhoNavio = 4; // Tamanho do navio

	        if (x1 == x2 && Math.abs(y1 - y2) == tamanhoNavio - 1) { // Posicionamento vertical
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirY = (y1 < y2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1][y1 + i * dirY] = 4; // 4 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else if (y1 == y2 && Math.abs(x1 - x2) == tamanhoNavio - 1) { // Posicionamento horizontal
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirX = (x1 < x2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1 + i * dirX][y1] = 4; // 4 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2) && Math.abs(x1 - x2) == tamanhoNavio - 1) { // Posicionamento diagonal
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirX = (x1 < x2) ? 1 : -1;
	                int dirY = (y1 < y2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1 + i * dirX][y1 + i * dirY] = 4; // 4 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else {
	            System.out.println("Posicionamento inválido para o navio. Tente novamente.");
	        }
	    }
	    System.out.println("navio posicionado com sucesso");

	    return table;
	    }
	
	public static int[][] contratorpedeiros (int[][]table) {
		
	    Scanner s = new Scanner(System.in);
	    boolean posicaoValida = false;

	    while (!posicaoValida) {
	        System.out.println("Digite a coluna em que a parte inicial do seu contratorpedeiros será posicionada (lembrando que as colunas vão de 0 a 9): ");
	        int y1 = s.nextInt();

	        System.out.println("Digite a linha em que a parte inicial do seu contratorpedeiros será posicionada (lembrando que as linhas vão de 0 a 9): ");
	        int x1 = s.nextInt();

	        System.out.println("Digite a coluna em que a parte final do seu contratorpedeiros será posicionada (lembrando que as colunas vão de 0 a 9): ");
	        int y2 = s.nextInt();

	        System.out.println("Digite a linha em que a parte final do seu contratorpedeiros será posicionada (lembrando que as linhas vão de 0 a 9): ");
	        int x2 = s.nextInt();

	        int tamanhoNavio = 3; // Tamanho do navio

	        if (x1 == x2 && Math.abs(y1 - y2) == tamanhoNavio - 1) { // Posicionamento vertical
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirY = (y1 < y2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1][y1 + i * dirY] = 3; // 3 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else if (y1 == y2 && Math.abs(x1 - x2) == tamanhoNavio - 1) { // Posicionamento horizontal
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirX = (x1 < x2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1 + i * dirX][y1] = 3; // 3 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2) && Math.abs(x1 - x2) == tamanhoNavio - 1) { // Posicionamento diagonal
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirX = (x1 < x2) ? 1 : -1;
	                int dirY = (y1 < y2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1 + i * dirX][y1 + i * dirY] = 3; // 3 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else {
	            System.out.println("Posicionamento inválido para o navio. Tente novamente.");
	        }
	    }
	    System.out.println("navio posicionado com sucesso");

	    return table;
	    }
	
	public static int[][] submarino (int[][]table) {
		
	    Scanner s = new Scanner(System.in);
	    boolean posicaoValida = false;

	    while (!posicaoValida) {
	        System.out.println("Digite a coluna em que a parte inicial do seu submarino será posicionada (lembrando que as colunas vão de 0 a 9): ");
	        int y1 = s.nextInt();

	        System.out.println("Digite a linha em que a parte inicial do seu submarino será posicionada (lembrando que as linhas vão de 0 a 9): ");
	        int x1 = s.nextInt();

	        System.out.println("Digite a coluna em que a parte final do seu submarino será posicionada (lembrando que as colunas vão de 0 a 9): ");
	        int y2 = s.nextInt();

	        System.out.println("Digite a linha em que a parte final do seu submarino será posicionada (lembrando que as linhas vão de 0 a 9): ");
	        int x2 = s.nextInt();

	        int tamanhoNavio = 2; // Tamanho do navio

	        if (x1 == x2 && Math.abs(y1 - y2) == tamanhoNavio - 1) { // Posicionamento vertical
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirY = (y1 < y2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1][y1 + i * dirY] = 2; // 2 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else if (y1 == y2 && Math.abs(x1 - x2) == tamanhoNavio - 1) { // Posicionamento horizontal
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirX = (x1 < x2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1 + i * dirX][y1] = 2; // 2 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2) && Math.abs(x1 - x2) == tamanhoNavio - 1) { // Posicionamento diagonal
	            if (verificarPosicoesLivres(table, x1, y1, x2, y2)) {
	                int dirX = (x1 < x2) ? 1 : -1;
	                int dirY = (y1 < y2) ? 1 : -1;

	                for (int i = 0; i < tamanhoNavio; i++) {
	                    table[x1 + i * dirX][y1 + i * dirY] = 2; // 2 representa o navio
	                }
	                posicaoValida = true; // Define a posição como válida e sai do loop
	            } else {
	                System.out.println("Posições já ocupadas por navio. Tente novamente.");
	            }
	        } else {
	            System.out.println("Posicionamento inválido para o navio. Tente novamente.");
	        }
	    }
	    System.out.println("navio posicionado com sucesso");

	    return table;
	    }
	
	
	
	
	
		
		
		
	
	public static void exibirTabuleiro(int[][] table) {
		
		System.out.println("eis aqui seu tabuleiro!");
		for (int[] linha : table) {
            for (int celula : linha) {
                if (celula == '\u0000') { 
                    System.out.print("- "); 
                } else {
                    System.out.print(celula + " ");
                }
            }
            System.out.println();
        }
	}
	
	public static void posicionarnavios(int[][]table) {
		porta_aviao(table);
		navio_tanque(table);
		navio_tanque(table);
		contratorpedeiros(table);
		contratorpedeiros(table);
		contratorpedeiros(table);
		submarino(table);
		submarino(table);
		submarino(table);
		submarino(table);
		exibirTabuleiro(table);
		
		
		
	}
	public static int[][] player1() {
		int[][] tab1 = Data.table();
		posicionarnavios(tab1);
		return tab1;
		
		
		
	}
	public static int[][] player2() {
		int[][] tab2 = Data.table();
		posicionarnavios(tab2);
		return tab2;
		
		
		
	}
	
	public static boolean verificar(int[][]table) {
		boolean vazio =false;
		int cont = 100;
		
		for (int[] linha : table) {
            for (int celula : linha) {
                if (celula == '\u0000') { 
                    cont=cont-1; 
                } 
            }
            
        }
		if(cont==0) {
			vazio = true;
		}
		return vazio;
		
		
		
	}
	public static int[][] atacar(int[][] table){
		Scanner s = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		boolean valida= false;
		while (valida==false) {
		System.out.println("Por favor, digite a coordenada horizontal(linha, de 0 a 9) que vai atacar ");
		x = s.nextInt();
		System.out.println("Por favor, digite a coordenada vertical(coluna, de 0 a 9) que vai atacar ");
		y = s.nextInt();
		if((x>=0 && x<=9)&&(y>=0&&y<=9)) {
			valida=true;
			break;
		}
		}
		int ataque = table[x][y];
		if(ataque==0) {
			System.out.println("infelizmente, seu ataque acertou a agua");
			
			
		}
		else if(ataque!=0) {
			System.out.println("parabens capitao, acertamos algo!");
			table[x][y]=0;
		}
		return table;
		
		
		
		
	}
	
	public static void jogar() {
		System.out.println("jogador 1, monte seu tablueiro, jogador 2, nao bisbilhote! quando estiver pronto pode comecar!");
		int[][] tab1 = player1();
		System.out.println("jogador 2, monte seu tablueiro, jogador 1, nao bisbilhote! quando estiver pronto pode comecar!");
		int [][]tab2 = player2();
		boolean vazio1 = verificar(tab1);
		boolean vazio2 = verificar(tab2);
		while(true) {
			atacar(tab2);
			vazio2=verificar(tab2);
			if(vazio2==true) {
				System.out.println("player 1 vence a guera!");
				break;
			}
			atacar(tab1);
			vazio1=verificar(tab1);
			if(vazio1==true) {
				System.out.println("player 2 vence a guerra!");
				break;
			}
			
			
		}
		
		
		
		
		
	}
	
	

}
