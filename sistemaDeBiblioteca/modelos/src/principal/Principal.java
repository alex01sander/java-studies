void main() {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Item> itens = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    BibliotecaFavoritos favoritos = new BibliotecaFavoritos();

    int opcao = -1;

    while (opcao != 0) {
        IO.println("\n=== Biblioteca ===");
        IO.println("1 - Cadastrar livro");
        IO.println("2 - Cadastrar revista");
        IO.println("3 - Cadastrar usuário");
        IO.println("4 - Emprestar item");
        IO.println("5 - Devolver item");
        IO.println("6 - Listar itens");
        IO.println("7 - Listar por classificação");
        IO.println("0 - Sair");
        IO.print("Opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1 -> cadastrarLivro(scanner, itens);
            case 2 -> cadastrarRevista(scanner, itens);
            case 3 -> cadastrarUsuario(scanner, usuarios);
            case 4 -> emprestarItem(scanner, itens, usuarios);
            case 5 -> devolverItem(scanner, itens, usuarios);
            case 6 -> listarItens(itens);
            case 7 -> listarOrdenado(itens);
            case 0 -> IO.println("Encerrando...");
            default -> IO.println("Opção inválida!");
        }
    }

    scanner.close();
}



static void cadastrarLivro(Scanner scanner, ArrayList<Item> itens) {
    IO.print("Título: ");
    String titulo = scanner.nextLine();

    IO.print("Autor: ");
    String autor = scanner.nextLine();

    IO.print("Número de páginas: ");
    int paginas = scanner.nextInt();
    scanner.nextLine();

    IO.print("Valor da multa: ");
    double multa = scanner.nextDouble();
    scanner.nextLine();

    itens.add(new Livro(titulo, multa, autor, paginas));
    IO.println("Livro cadastrado!");
}

static void cadastrarRevista(Scanner scanner, ArrayList<Item> itens) {
    IO.print("Título: ");
    String titulo = scanner.nextLine();

    IO.print("Edição: ");
    int edicao = scanner.nextInt();
    scanner.nextLine();

    IO.print("Tema: ");
    String tema = scanner.nextLine();

    IO.print("Valor da multa: ");
    double multa = scanner.nextDouble();
    scanner.nextLine();

    itens.add(new Revista(titulo, multa, edicao, tema));
    IO.println("Revista cadastrada!");
}

static void cadastrarUsuario(Scanner scanner, ArrayList<Usuario> usuarios) {
    IO.print("Nome do usuário: ");
    String nome = scanner.nextLine();

    usuarios.add(new Usuario(nome));
    IO.println("Usuário cadastrado!");
}

static void emprestarItem(Scanner scanner, ArrayList<Item> itens, ArrayList<Usuario> usuarios) {
    if (itens.isEmpty() || usuarios.isEmpty()) {
        IO.println("Cadastre itens e usuários primeiro.");
        return;
    }

    listarItens(itens);
    IO.print("Número do item: ");
    int idxItem = scanner.nextInt() - 1;
    scanner.nextLine();

    listarUsuarios(usuarios);
    IO.print("Número do usuário: ");
    int idxUsuario = scanner.nextInt() - 1;
    scanner.nextLine();

    if (idxItem < 0 || idxItem >= itens.size()
            || idxUsuario < 0 || idxUsuario >= usuarios.size()) {
        IO.println("Número inválido.");
        return;
    }

    usuarios.get(idxUsuario).pegarEmprestimo(itens.get(idxItem));
}

static void devolverItem(Scanner scanner, ArrayList<Item> itens, ArrayList<Usuario> usuarios) {
    listarUsuarios(usuarios);
    IO.print("Número do usuário: ");
    int idxUsuario = scanner.nextInt() - 1;
    scanner.nextLine();

    if (idxUsuario < 0 || idxUsuario >= usuarios.size()) {
        IO.println("Usuário inválido.");
        return;
    }

    Usuario usuario = usuarios.get(idxUsuario);

    if (usuario.getEmprestimos().isEmpty()) {
        IO.println("Esse usuário não tem itens emprestados.");
        return;
    }


    for (int i = 0; i < usuario.getEmprestimos().size(); i++) {
        IO.println((i + 1) + " - " + usuario.getEmprestimos().get(i).getTitulo());
    }

    IO.print("Número do item para devolver: ");
    int idxItem = scanner.nextInt() - 1;
    scanner.nextLine();

    usuario.devolver(usuario.getEmprestimos().get(idxItem));
}

static void listarItens(ArrayList<Item> itens) {
    IO.println("\n--- Itens ---");
    for (int i = 0; i < itens.size(); i++) {
        String status = itens.get(i).isEmprestado() ? "[emprestado]" : "[disponível]";
        IO.println((i + 1) + " - " + itens.get(i).toString() + " " + status);
    }
}

static void listarOrdenado(ArrayList<Item> itens) {
    itens.sort((a, b) -> b.getClassificacao() - a.getClassificacao());
    IO.println("\n--- Itens por classificação ---");
    for (Item item : itens) {
        IO.println(item.getTitulo() + " | " + item.getClassificacao() + " pts");
    }
}

static void listarUsuarios(ArrayList<Usuario> usuarios) {
    IO.println("\n--- Usuários ---");
    for (int i = 0; i < usuarios.size(); i++) {
        IO.println((i + 1) + " - " + usuarios.get(i).getNome());
    }
}