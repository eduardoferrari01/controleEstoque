package br.com.estoque.web.controller.api;

import java.util.List;
import br.com.estoque.domain.Categoria;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "/rest/categoria", tags = "Categoria Controller")
public interface CategoriaApi extends ApiController<Categoria> {

  @ApiOperation(value = "Cadastro de um nova categoria.",
      notes = "Esta operação tem por objetivo cadastrar uma nova categoria.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 201, message = "Sucesso ao cadastrar uma nova categoria.",
          response = Categoria.class),
      @ApiResponse(code = 400, message = "Cadastro inválido."),
      @ApiResponse(code = 401, message = "Cadastro não autorizado."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar realizar o cadastro.")})
  void save(Categoria categoria);

  @ApiOperation(value = "Altera uma categoria existente.",
      notes = "Esta operação tem por objetivo alterar uma categoria existente.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 202, message = "Sucesso ao alterar uma categoria existente.",
          response = Categoria.class),
      @ApiResponse(code = 400, message = "Alteração inválida."),
      @ApiResponse(code = 401, message = "Alteração não autorizada."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a alteração.")})
  void edit(Categoria categoria);

  @ApiOperation(value = "Consulta todas as categoria.",
      notes = "Esta operação tem por objetivo consulta todas as categoria.", response = List.class,
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Sucesso ao consultar todas as categorias.",
          response = Categoria.class),
      @ApiResponse(code = 400, message = "Consulta inválida."),
      @ApiResponse(code = 401, message = "Consulta não autorizada."),
      @ApiResponse(code = 404, message = "Nenhuma categoria encontrado para a consulta."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar  realizar a consulta.")})
  List<Categoria> findAll();

  @ApiOperation(value = "Consulta uma categoria existe por id.",
      notes = "Esta consulta tem por objetivo consultar uma categoria existente por id.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Sucesso ao consultar uma categoria existente por id.",
          response = Categoria.class),
      @ApiResponse(code = 400, message = "Consulta inválida."),
      @ApiResponse(code = 401, message = "Consulta não autorizada."),
      @ApiResponse(code = 404, message = "Nenhuma categoria encontrado para a consulta por id."),
      @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a consulta por id.")})
  Categoria findById(Long id);

  @ApiOperation(value = "Exclui uma categoria existente.",
      notes = "Esta operação tem por objetivo excluir uma categoria existente.",
      consumes = "application/json", produces = "application/json")
  @ApiResponses(
      value = {@ApiResponse(code = 204, message = "Sucesso ao excluir uma categoria existente."),
          @ApiResponse(code = 400, message = "Exclusão inválida."),
          @ApiResponse(code = 401, message = "Exclusão não autorizada."),
          @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a exclusão.")})
  void delete(Long id);
}
