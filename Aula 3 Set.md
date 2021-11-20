# set

* **Implementações que abordaremos**: java.util.hashSet, java.util.TreeSet, java.util.LinkedHashSet
* Por padrão não garante ordem.
* Não permite itens repetidos.
* Permite adição e remoção normalmente. Não possui busca por item e atualização. Para leitura apenas navegação
* Não permite mudança de ordenação.

## HashSet()

### Quando Utilizar?
+---------------+---------------------+---------------------+---------------------------------------+--+
| Método        | Quando Utilizar     | Ordenação           | Performace                            |  |
+---------------+---------------------+---------------------+---------------------------------------+--+
| HashSet       | Quando não é        | Não é ordenado,     | Por não ter repetição de valores      |  |
|               | necessário          | Não permite         | e não ser ordenado, é a implementação |  |
|               | uma ordenação       | valores repetidos   | mais performática                     |  |
+---------------+---------------------+---------------------+---------------------------------------+--+
| LinkedHashSet | Quando é necessário | Mantém a ordem de   | É a implementação mais lenta por      |  |
|               | manter a ordem de   | inserção dos ele-   | por ser necessária manter a ordem     |  |
|               | inserção dos        | mentos              |                                       |  |
|               | elementos           |                     |                                       |  |
+---------------+---------------------+---------------------+---------------------------------------+--+
| TreeSet       | Quando é necessário | Mantem a ordem e    | É performático para leitura. Para mo- |  |
|               | manter a ordem com  | pode ser reordenado | dificação é necessário reordenar      |  |
|               | Comparators         |                     | sendo mais lento que o LinkedHashSet  |  |
+---------------+---------------------+---------------------+---------------------------------------+--+
|               |                     |                     |                                       |  |
+---------------+---------------------+---------------------+---------------------------------------+--+

