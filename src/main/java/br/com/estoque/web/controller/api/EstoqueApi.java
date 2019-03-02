package br.com.estoque.web.controller.api;

import java.util.List;
import br.com.estoque.domain.Estoque;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "/rest/estoque", tags = "Estoque Controller")
public interface EstoqueApi extends ApiController<Estoque> {

  @ApiOperation(value = "Cadastro de um novo estoque.",
      notes = "Esta operação tem por objetivo cadastrar um novo estoque.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 201, message = "Sucesso ao cadastrar um novo estoque.",
          response = Estoque.class),
      @ApiResponse(code = 400, message = "Cadastro inválido."),
      @ApiResponse(code = 401, message = "Cadastro não autorizado."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar realizar o cadastro.")})
  void save(Estoque estoque);

  @ApiOperation(value = "Altera um estoque existente.",
      notes = "Esta operação tem por objetivo alterar estoque existente.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 202, message = "Sucesso ao alterar um estoque existente.",
          response = Estoque.class),
      @ApiResponse(code = 400, message = "Alteração inválida."),
      @ApiResponse(code = 401, message = "Alteração não autorizada."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a alteração.")})
  void edit(Estoque estoque);

  @ApiOperation(value = "Consulta todo estoques.",
      notes = "Esta operação tem por objetivo consulta todos os estoques.", response = List.class,
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Sucesso ao consultar todos os estoques.",
          response = Estoque.class),
      @ApiResponse(code = 400, message = "Consulta inválida."),
      @ApiResponse(code = 401, message = "Consulta não autorizada."),
      @ApiResponse(code = 404, message = "Nenhum estoque encontrado para a consulta."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar  realizar a consulta.")})
  List<Estoque> findAll();

  @ApiOperation(value = "Consulta um estoque existe por id.",
      notes = "Esta consulta tem por objetivo consultar um estoque existente por id.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Sucesso ao consultar um estoque existente por id.",
          response = Estoque.class),
      @ApiResponse(code = 400, message = "Consulta inválida."),
      @ApiResponse(code = 401, message = "Consulta não autorizada."),
      @ApiResponse(code = 404, message = "Nenhum estoque encontrado para a consulta por id."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a consulta por id.")})
  Estoque findById(Long id);

  @ApiOperation(value = "Exclui um estoque existente.",
      notes = "Esta operação tem por objetivo excluir um estoque existente.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(
      value = {@ApiResponse(code = 204, message = "Sucesso ao excluir um estoque existente."),
          @ApiResponse(code = 400, message = "Exclusão inválida."),
          @ApiResponse(code = 401, message = "Exclusão não autorizada."),
          @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a exclusão.")})
  void delete(Long id);
}
