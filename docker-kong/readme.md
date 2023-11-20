## O que é um API Gateway?🤔

Um API Gateway é um componente fundamental na arquitetura de sistemas distribuídos e é usado para gerenciar, rotear e controlar o acesso a APIs (Interfaces de Programação de Aplicativos) em um ambiente distribuído. Ele atua como um ponto de entrada para várias APIs e serviços, centralizando as solicitações de clientes, o que simplifica o acesso e a governança de APIs.

Aqui estão alguns aspectos-chave do API Gateway:

Ponto de Entrada Único: O API Gateway serve como um único ponto de entrada para múltiplas APIs. Isso significa que os clientes só precisam interagir com o API Gateway, que encaminha as solicitações para os serviços relevantes.

Roteamento e Redirecionamento: Ele pode rotear solicitações de entrada para os serviços ou microsserviços apropriados com base em regras de roteamento configuradas. Isso pode incluir redirecionamento de solicitações, balanceamento de carga ou tratamento de versões diferentes de APIs.

Agregação de Serviços: Em algumas situações, um API Gateway pode ser configurado para agregar dados de vários serviços para fornecer uma resposta consolidada a uma solicitação do cliente. Isso é útil quando os clientes precisam de informações de vários serviços para completar uma operação.

Segurança e Autenticação: O API Gateway pode lidar com aspectos de segurança, como autenticação e autorização, centralizando esses mecanismos para todas as APIs que estão protegendo. Isso pode incluir autenticação de usuários, verificações de tokens, verificação de permissões, entre outros.

Monitoramento e Analytics: Ele pode fornecer recursos de monitoramento e análise para o tráfego de API, permitindo aos desenvolvedores e administradores obter informações sobre o uso, desempenho e saúde das APIs.

Transformação de Dados: Em muitos casos, um API Gateway é capaz de transformar formatos de dados de entrada e saída, adaptando as requisições dos clientes aos formatos específicos necessários pelos serviços.

Cache e Otimização: Pode implementar estratégias de cache para armazenar temporariamente dados frequentemente solicitados, reduzindo a carga nos serviços e melhorando o desempenho.

Em essência, um API Gateway simplifica e gerencia o acesso a APIs diversas, oferecendo uma camada de abstração entre os clientes e os serviços subjacentes. Isso simplifica a complexidade do acesso a diferentes serviços, oferece segurança, controle e monitoramento centralizado, além de facilitar a manutenção e a evolução das APIs em um sistema distribuído.

## O que é Kong?🦍

O Kong é uma plataforma de código aberto para gerenciamento de APIs e microsserviços. O Kong oferece um API Gateway altamente escalável e extensível, que simplifica a administração, o monitoramento e o controle do tráfego das APIs.

Aqui estão alguns pontos importantes sobre o Kong API Gateway:

Gateway de API: O Kong funciona como um gateway de API, atuando como ponto de entrada para as solicitações dos clientes e roteando essas solicitações para os serviços apropriados. Ele centraliza o acesso às APIs, proporcionando uma interface única para os consumidores.

Escalabilidade e Desempenho: É altamente escalável, o que significa que pode lidar com grandes volumes de tráfego de API sem perder desempenho. Isso é crucial em ambientes onde há um grande número de solicitações de clientes.

Extensibilidade: Kong é altamente extensível e permite a adição de plugins para estender suas funcionalidades. Existem plugins disponíveis para autenticação, autorização, rate limiting, transformação de dados, entre outros.

Gerenciamento de Tráfego: Oferece recursos avançados para gerenciamento de tráfego, como roteamento baseado em regras, balanceamento de carga, controle de versões de API e resiliência.

Segurança: O Kong fornece recursos de segurança, como autenticação e autorização, permitindo que os administradores controlem quem pode acessar as APIs e quais permissões estão associadas a esses acessos.

Monitoramento e Analytics: Oferece recursos de monitoramento e análise para acompanhar o tráfego, o desempenho e a saúde das APIs. Isso ajuda os administradores a identificar gargalos de desempenho e tomar decisões informadas sobre a otimização do sistema.

Ecosistema de Plugins: Um dos pontos fortes do Kong é sua extensa variedade de plugins que permitem personalizar e estender suas funcionalidades, adaptando-o às necessidades específicas de cada aplicação ou sistema.

Licença e Comunidade: Kong é uma plataforma de código aberto, licenciada sob a licença Apache 2.0, o que significa que é livre para ser usado, modificado e distribuído.

Em resumo, o Kong é uma solução robusta e flexível para gerenciamento de APIs, oferecendo recursos avançados de gateway, segurança, monitoramento e extensibilidade para facilitar o desenvolvimento, a administração e a escalabilidade de arquiteturas baseadas em microsserviços e APIs.

# Na prática👨‍💻

http://localhost:8000 é onde fica a API Gateway do Kong, por lá é onde é feito todo o roteamento dos end-poin's cadastrados no Kong, ou seja, lá é o base o URL de todos os seus serviços.