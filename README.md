# Recycle View

## Oque é uma Recycle View?

- A RecyclerView é um contêiner usado para exibir uma lista ou grade de dados, como texto ou fotos.
- Quando uma lista é rolada, apenas algumas visualizações são efetivamente exibidas na tela.
- Quando uma visualização sai da tela, a RecyclerView a reutiliza e preenche com novos dados.
- [Entendendo sobre Recycle Views](https://medium.com/androiddevelopers/getting-to-know-recyclerview-ea14f8514e6)

## Como funciona:
- A RecyclerView recicla elementos individuais para melhorar o desempenho e a responsividade do seu aplicativo.
- Cada elemento na lista é definido por um objeto chamado view holder.
O view holder é uma espécie de invólucro em torno de uma View e é gerenciado pela RecyclerView.
- O Adapter associa seus dados aos view holders.
- O LayoutManager organiza os elementos individualmente na lista, permitindo que você use um dos gerenciadores de layout padrão fornecidos pela biblioteca RecyclerView ou defina o seu próprio.
- [Criar Listas com Recycle View](https://developer.android.com/develop/ui/views/layout/recyclerview?hl=pt-br)

## Passos para implementar a RecyclerView:
- **Planeje seu layout:**
  - Decida como a lista ou grade será exibida. Normalmente, você pode usar um dos gerenciadores de layout padrão da biblioteca RecyclerView.
- **Projete cada elemento:**
  - Baseado no design, estenda a classe ViewHolder.
  - Seu ViewHolder fornece toda a funcionalidade para os itens da lista.
- **Defina o Adapter:**
    - Associe seus dados aos view holders.
    - Você pode personalizar ainda mais sua RecyclerView para atender às suas necessidades específicas.

### Resumo:
- A RecyclerView é uma ferramenta poderosa para criar listas dinâmicas e eficientes em aplicativos Android. Ela simplifica a exibição e manipulação de grandes conjuntos de dados, tornando o desenvolvimento mobile mais eficiente e responsivo.

#### Créditos:

- O trabalho se baseou em algumas pesquisas, direcionadas em grande maioria a documentação oficial do android.
- O breve projeto foi possivel ser realizado com funções até então pouco exploradas em sala, utilizamos o canal [**Android Knowledge**](https://www.youtube.com/@android_knowledge/videos) como fonte de busca para exemplificações de como aplicar as Recycle Views em determinadas situações. O código em si se baseia neste [video](https://www.youtube.com/watch?v=UDfyZLWyyVM).