# CEP Searcher API

> Status do projeto: Finalizado ✅

A proposta desse projeto é consultar informações de endereço, como rua, bairro, cidade e estado, com base no CEP, utilizando a API do ViaCEP. 🏠

O ViaCEP é um serviço  que fornece dados de endereços do Brasil de forma gratuita, disponibilizando uma API, a qual é possível consumir e obter os dados.

Este sistema realiza as buscas utilizando a biblioteca Java HTTP, que estabelece uma conexão com a API do ViaCEP, envia uma requisição com o CEP fornecido pelo usuário e recebe uma resposta contendo todos os detalhes do endereço, retornado um arquivo .json com os dados o endereço. Além disso, o CEP também é validado, e possíveis erros de digitação tratados, assim como CEPs inexistentes.

Pude colocar em prática diversos conceitos de Java, como:
- *Programação Orientada a Objetos:* aplicando abstração, encapsulamento, polimorfismo e herança, seguindo boas práticas de POO;
- *Consumo de APIs*: criando um cliente, disparando uma requisição e tratando a resposta;
- *Manipulação de Arquivos:* criando e lendo arquivos .json;
- *Serialização/Desserialização:* usando a biblioteca GSON do google para realizar a conversão de JSON para objeto e vice-versa.

Vale ressaltar que para rodar essa aplicação você deve ter o arquivo .jar da biblioteca java GSON do google instalad, para que os arquivos possam ser gerados corretamente.
