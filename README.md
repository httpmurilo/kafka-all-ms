# Consumer

2. Na fila de mensagens recebe a mensagem e começa a processá-la.
3. Verifica se o produto está em estoque e atualiza o banco de dados.
4. Fatura o cartão de crédito do usuário usando uma API de pagamento.
5. Envia uma mensagem de notificação para o usuário informando que a compra foi recebida.
6. Envia uma mensagem para o departamento de envio para enviar o produto.
7. Quando o produto é enviado, o trabalhador envia uma mensagem de notificação para o usuário informando que a compra foi enviada.
8. Atualiza o estoque do produto no banco de dados.

# Producer



1. Quando um usuário faz uma compra, a aplicação envia uma mensagem para a fila de mensagens com as informações da compra.
