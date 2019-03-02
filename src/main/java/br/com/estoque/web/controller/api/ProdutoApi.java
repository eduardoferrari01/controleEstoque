package br.com.estoque.web.controller.api;

import java.util.List;
import br.com.estoque.domain.Produto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "/rest/produto", tags = "Produto Controller")
public interface ProdutoApi extends ApiController<Produto> {

  @ApiOperation(value = "Cadastro de um novo produto.",
      notes = "Esta operação tem por objetivo cadastrar um novo produto.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 201, message = "Sucesso ao cadastrar um novo produto.",
          response = Produto.class),
      @ApiResponse(code = 400, message = "Cadastro inválido."),
      @ApiResponse(code = 401, message = "Cadastro não autorizado."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar realizar o cadastro.")})
  void save(Produto produto);

  @ApiOperation(value = "Altera um produto existente.",
      notes = "Esta operação tem por objetivo alterar produto existente.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 202, message = "Sucesso ao alterar um produto existente.",
          response = Produto.class),
      @ApiResponse(code = 400, message = "Alteração inválida."),
      @ApiResponse(code = 401, message = "Alteração não autorizada."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a alteração.")})
  void edit(Produto produto);

  @ApiOperation(value = "Consulta todos produtos.",
      notes = "Esta operação tem por objetivo consulta todos os produtos.", response = List.class,
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Sucesso ao consultar todos os produtos.",
          response = Produto.class),
      @ApiResponse(code = 400, message = "Consulta inválida."),
      @ApiResponse(code = 401, message = "Consulta não autorizada."),
      @ApiResponse(code = 404, message = "Nenhum produto encontrado para a consulta."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar  realizar a consulta.")})
  List<Produto> findAll();

  @ApiOperation(value = "Consulta um produto existe por id.",
      notes = "Esta consulta tem por objetivo consultar um produto existente por id.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Sucesso ao consultar um produto existente por id.",
          response = Produto.class),
      @ApiResponse(code = 400, message = "Consulta inválida."),
      @ApiResponse(code = 401, message = "Consulta não autorizada."),
      @ApiResponse(code = 404, message = "Nenhum produto encontrado para a consulta por id."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a consulta por id.")})
  Produto findById(Long id);

  @ApiOperation(value = "Exclui um produto existente.",
      notes = "Esta operação tem por objetivo excluir um produto existente.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(
      value = {@ApiResponse(code = 204, message = "Sucesso ao excluir um produto existente."),
          @ApiResponse(code = 400, message = "Exclusão inválida."),
          @ApiResponse(code = 401, message = "Exclusão não autorizada."),
          @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a exclusão.")})
  void delete(Long id);
}
