# RESTModel
O objetivo deste projeto é criar um modelo que representa um objeto que será usado para fazer requisições via REST API. Este contém atributos que representa o header, o body e os respectivos métodos `POST`, `GET` e `DELETE`. 

_Este projeto foi desenvolvido para a cadeira de **Semântica de Linguagens de Programação** da UPE em 2018.2_.

## Modelo Java
O modelo Java contém um path, um header em formato de String e um body como HashMap. Estes serão convertidos para JSON na hora de enviar a requisição.

```
Request

  Path : String
  Header : String
  Body : HashMap<String, String>
  
  get()
  post()
  delete()
  ```
 
  
