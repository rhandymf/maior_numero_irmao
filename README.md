# Maior Número Irmão

Retorna o maior número irmão.

## Descrição

Dois números inteiros não negativos são chamados de irmãos se eles podem ser
obtidos uns dos outros, apenas reorganizando os dígitos de suas representações
decimais. Por exemplo, 123 e 213 são irmãos. 535 e 355 também são irmãos.
Um conjunto que consiste em um inteiro não negativo N e todos os seus irmãos é
chamado de família de N. Por exemplo, a família de 553 é composta por três números:
355, 535 e 553.

### Requisitos

* Apenas um número deve ser informado;
* O número deve ser inteiro;
* O número deve ser maior que 0(zero);
* O número deve ser menor que 100.000.000(cem milhões);
* Caso as condições acima não sejam satisfeitas, o valor "-1" será retornado.

```
input = 123 -> output = 321
input = -654 -> output = -1
input = 100800841 -> output = -1
```
### Executar

No terminal, acessar a raiz do projeto e executar:
java -Dfile.encoding=UTF-8 -classpath bin principal.Principal "valor_desejado"

```
java -Dfile.encoding=UTF-8 -classpath /home/usuario/eclipse-workspace/workspace-navita/maior_numero_irmao/bin principal.Principal 89459129
```
## Autor

* **Rhandy Mendes Ferreira** - *Desenvolvedor* - [rhandymf](https://github.com/rhandymf)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
