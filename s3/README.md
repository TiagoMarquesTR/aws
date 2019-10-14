# List of commands to interact with AWS CLI

Create a bucket
```
aws s3 mb s3://tiagobmtest
```

List buckets
```
aws s3 ls
```

Remove a bucket
```
aws s3 rb s3//:tiagobmtest //--Remove buckets
```

```
aws s3 ls s3://tiagobmtest //-- LIsta o conteudo dentro do bucket 
```

```
aws s3 rb s3//:tiagobmtest --force //-- Remove buckets mesmo com arquivos dentro
```

```
aws s3 cp s3://tiagobmtest/bucket.png . //-- COpia um arquivo do S3 para o diretorio local
```

```
aws s3 cp teste.txt s3://tiagobmtest //-- Copia um arquivo locla para S3
```

```
aws s3 rm s3://tiagobmtest/teste.txt //-- Remove um arquivo do S3
```

```
aws s3 mv s3://tiagobmtest/teste.txt s3://tiagobmtest/testando.txt //-- Renomeia um arquivo no S3
```

```
aws s3 sync s3://tiagobmtest alura-s3 //-- Sincroniza um pasta do S3 para pasta local
```

```
aws s3 sync . s3://alura-s3 //-- Sin pasta local para S3
```

```
aws s3 sync . s3://alura-s3 --delete //-- Sincronizaçao com objetos deletados
```

```
```