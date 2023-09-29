**Testes unitários em java**

**As tabelas abaixo são os dados das user stories, BDD, TDD, do código acima.**

**Note que a user storie 1 escolhida para aplicação de BDD.**

**Os TDD são as aplicações do BDD em código em situações de testes.**

**Apenas o TDD 1 foi um teste concluído.**

**Os TDD  2 e 3, foram feitos para falhar.**

|**USER STORIES**||||||
| :-: | :- | :- | :- | :- | :- |
|#P|#C|As a < type of user >|I want < some goal >|so that < some reason >||
|1|Usuário|COMO Usuário da plataforma de cursos |QUERO que assim que pagar minha mensalidade, meu conjunto de cursos seja disponibilizado |PARA acessar e dar início aos meus cursos||
|2|Aluno|COMO Aluno da<br>plataforma de cursos|QUERO mais 3 cursos quando finalizar meu curso com a média acima de 7.|Para adquirir mais 3 cursos.||
|3|Aluno|COMO Aluno da<br>plataforma de cursos|QUERO que assim que possuir o maior número de comentários úteis em fóruns, receba o direito a um curso extra|Para poder realizar um novo curso||


|**BDD - SCENARIOS - ACCEPTANCE CRITERIA**|||||
| :-: | :- | :- | :- | :- |
|Given|And|When|And|Then|
|Dado um perfil logado| |Quando o valor mensal é pago|E o valor é validado|Então o conjunto de cursos fica disponível|
|Dado um perfil logado| |Quando o valor mensal é pago| |Então quero visualizar os cursos que foram disponibilizados|
|Dado um usuário logado| |Quando o valor mensal é pago|E nenhum curso foi iniciado|Então o conjunto de cursos é mostrado vazio|


|**TDD**|||
| :- | :- | :- |
|SCENARIO|EXECUTION|RESULTS (ASSERTS)|
|@Test<br>public void verificaEstado() {<br>Perfil perfil = new Perfil(false);<br>Perfil perfil2 = new Perfil(true);<br>}|perfil.verificarPagamento();<br>perfil2.verificarPagamento();|Assert.assertEquals("Pagamento pendente. Realize o pagamento para acessar os cursos.", perfil.verificarPagamento());<br>Assert.assertEquals("Cursos Disponiveis", perfil2.verificarPagamento());|
|@Test<br>public void visualizarCursos() {<br>Perfil perfil = new Perfil(true);<br>}|perfil.visualizarCursos();|Assert.assertEquals(cursos, perfil.visualizarCursos());|
|@Test<br>public void visualizarQtdCursos() {<br>Perfil perfil = new Perfil(true);<br>}|perfil.cursosQuantidades();|assertEquals(0, perfil.buscaCursosQtd().size());|

