# FictiusClean
Projeto Desenvolvido para teste de Backend

- DESAFIO

Criar uma API Rest de cadastro de veículos para armazenar os veículos utilizados pela
empresa. O cadastro deverá conter os seguintes dados:
▪ Nome
▪ Marca
▪ Modelo
▪ Data de fabricação
▪ Consumo Médio de combustível dentro de cidade (KM/L)
▪ Consumo Médio de combustível em rodovias (KM/L)
Criar uma API para realizar o cálculo de previsão de gastos.
Deverá receber como parâmetro as seguintes informações:
▪ Preço da gasolina R$
▪ Total de km que será percorrido dentro da cidade
▪ Total de km que será percorrido em rodovias
O retorno deverá ser uma lista ranqueada dos veículos da empresa levando em
consideração o valor gasto com combustível.
O retorno deverá ter os seguintes dados:
▪ Nome
▪ Marca
▪ Modelo
▪ Ano
▪ Quantidade de combustível gasto
▪ Valor total gasto com combustível


-----------------------------------------------------------------------


- PRE REQUISITOS 

- JDK 8
- MYSQL
- Spring Tool Suite 4 -  4.8.1

--------------------------------------------------------------------------

- COMO EXECUTAR

- CRIAR AS TABELAS NO BANCO MYSQL 


- NOME DO BANCO EM QUE FOI CRIADO PODENDO ALTERAR NO PROPETIES: teste_rpa


- NOME DA TABELA:cadastroveiculos


-ESTRUTURA DA TABELA
- ![image](https://user-images.githubusercontent.com/51979696/171484529-c0b911b7-194e-499e-8fe1-b639db910657.png)




Após estruturação do BANCO OK, Executar o projeto SpringAPP.


![image](https://user-images.githubusercontent.com/51979696/171486876-a7328925-e411-4cd1-9e76-f25ace64fb29.png)


- EXISTE UM ARQUIVO .JSON UTILIZADO NO POSTMAN PARA TESTE DOS PARAMETROS
