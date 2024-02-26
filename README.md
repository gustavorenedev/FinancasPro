# FinancasPro

API do projeto Finanças Pro = Controle de Despesas Pessoais

## Requisitos

- [ ] CRUD de Categorias
- [ ] CRUD de Movimentações
- [ ] CRUD de Usuários
- [ ] Autenticação
- [ ] Dashboard

## Documentação

### Endpoints

- [Listar Categoria](#listar-categorias)
- [Cadastrar Categoria](#cadastrar-categoria)
- [Detalhes da Categoria](#detalhe-categoria)
- [Apagar Categoria](#apagar-categoria)
- [Atualizar Categoria](#atualizar-categoria)

### Listar Categorias

`GET` /categoria

Retorna um array com todas as categorias cadastradas.

### Exemplo de Resposta

```js
[
    {
        "id": 1,
        "nome": "Alimentação",
        "icone": "Fast-food"
    },
    {
        "id": 2,
        "nome": "Educação",
        "icone": "Book"
    },
]
```

#### Código de Status

| código | descricao
|--------|-----------
|200|Categorias retornadas com sucesso
|401|Usuário não autenticado. Realize a autenticação em /login

---

### Cadastrar Categoria

`POST` /categoria

Cadastrar uma nova categoria para o usuário logado com os dados
enviados no corpo da requisição.

#### Corpo da Requisição

| campos | tipo | obrigatório | descrição
|--------|------|:-------------:|-----------
|nome|string|✅| Um nome curto para a categoria
|icone|string|❌|O nome do ícone conforme Material Icons

```js
{
    "nome": "Alimentação",
    "icone": "fast-food"
}
```
### Exemplo de Resposta
```js

{
    "id": 1,
    "nome": "Alimentação",
    "icone": "Fast-food"
},

```

#### Código de Status

| código | descricao
|--------|-----------
|200|Categoria cadastrada com sucesso
|400|Validação falhou. Verifique as regras para o corpo da requisição
|401|Usuário não autenticado. Realize a autenticação em /login

---

### Detalhes da Categoria

`GET` /categoria/`{id}`

Retorna os dados detalhados da categoria com o `id` informado no
parâmetro de path.

### Exemplo de Resposta
```js
// requisição para /categoria/1
{
    "id": 1,
    "nome": "Alimentação",
    "icone": "Fast-food"
},

```

#### Código de Status

| código | descricao
|--------|-----------
|200|Dados da categoria retornados com sucesso
|401|Usuário não autenticado. Realize a autenticação em /login
|404|Não existe categoria com o `id` informado. Consulte lista em /
categoria

---

### Apagar Categoria

`DELETE` /categoria/`{id}`

Apaga a categoria indicada pelo `id` enviado no parâmetro de path.

#### Código de Status

| código | descricao
|--------|-----------
|200|Categoria apagado com sucesso
|401|Usuário não autenticado. Realize a autenticação em /login
|404|Não existe categoria com o `id` informado. Consulte lista em /
categoria

---

### Atualizar Categoria

`PUT` /categoria/`{id}`

Atualizar os dados da categoria com o `id` informado no path,
utilizando os novos dados enviados no corpo da requisição

#### Corpo da Requisição

| campos | tipo | obrigatório | descrição
|--------|------|:-------------:|-----------
|nome|string|✅| Um nome curto para a categoria
|icone|string|✅|O nome do ícone conforme Material Icons

```js
{
    "nome": "Alimentação",
    "icone": "fast-food"
}
```
### Exemplo de Resposta
```js

{
    "id": 1,
    "nome": "Alimentação",
    "icone": "Fast-food"
},

```

#### Código de Status

| código | descricao
|--------|-----------
|200|Categoria atualizado com sucesso
|400|Validação falhou. Verifique as regras para o corpo da requisição
|401|Usuário não autenticado. Realize autenticação em /login
|404|Não existe categoria com o `id` informado. Consulte lista em /
categoria
---
