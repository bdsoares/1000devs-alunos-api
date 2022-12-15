
# Projeto API 1000 DEVs (CRUD)
EXERCÍCIOS VISTOS EM SALA

Programa 1000 DEVs - Turma 2


### Aula 15:

#### 2. Crie um novo projeto e implemente o CRUD (REST) de peças

Atributos de peça:
- código de barras (chave primária)
- nome
- modelo do carro (para qual carro é aquela peça)
- fabricante
- preço de custo
- preço de venda
- quantidade em estoque    
- categoria (aqui você deverá guardar valores fixos, ex: funilaria, motor, performance, som). [Utilizar os Enums (pesquise sobre isso)].

### Aula 16:
- Implemente a tratativa de exceções na sua API de Peças.
- Adeque sua API de Peças para usar validações de entrada
- Crie uma tratativa no seu exception handler para quando há um problema de validação
- Crie uma trativa no seu exception handler para quando há um erro interno. (Qualquer exceção que não seja das que já foram tratadas)

#

Vamos continuar o desenvolvimento da API de peças.

O ID de peça deve ser auto-gerado e, portanto, não deverá ser recebido na entrada (crie um DTO pra isso)
Em todas as listagens de peças não deverá ser mostrado o preço de custo (crie um DTO pra isso)
Os únicos valores alteráveis de peça deverão ser preço de custo, venda e quantidade em estoque(crie um DTO pra isso)

Implemente os seguintes endpoints:

#### GET /pecas/{texto}/comeco
- listar todas as peças começadas com o nome começado por um determinado texto(ex: todas as peças com o nome começado pela letra m);

#### GET /pecas/{modelo}/modelo
- listar todas as peças para um determinado modelo de carro (o carro deverá ser lido);

#### GET /pecas/{categoria}/categoria
- listar todas as peças de uma determinada categoria;

