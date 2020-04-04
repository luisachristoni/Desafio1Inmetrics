#language: pt
Funcionalidade: Criar Tarefa
  
  Como um usuario
  Eu quero criar uma tarefa
  Para poder visualizar tarefas

  Cenário: Criar Usuário
    Dado que acesso a tela de cadastro
    Quando informo dados de cadastro
    E clico em salvar
    Então visualizo a tela incial

  Cenário: Fazer Login com sucesso
    Dado que acesso a tela de login
    Quando informo os dados de login
    Então visualizo a tela inicial

  Cenário: Criar Tarefa
    Dado que estou logado
    Quando adiciono uma nova tarefa
    Então consigo visualizar a tarefa criada
