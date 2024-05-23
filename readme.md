API de Short URL desenvolvida para o Bootcamp Santander Coders.

A API conta com um sistema simples onde deve ser feito um POST no endpoint /short passando um json com o seguinte corpo:

```json
{
"url": "sua_url"
}
```
é devolvida uma resposta com o seguinte corpo e um header com location com a url completa para ser redirecionado.

```json
{
  "inputUrl": "url original",
  "shortUrlId": "id da url reduzida",
  "createdAt": "data de criação"
}
```

O sistema usando como banco de dados o MariaDB.


**Diagrama de classe:**

[![](https://mermaid.ink/img/pako:eNpFj70OwjAMhF8l8gSiT9ANqWOZQheUxUpMG5GfykmQUNV3J4UKJn93Op3tBXQ0BC1ohyl1FkdGr8JHiYGdnCJnsajQxzAKa1SQmW3Fwu7HaQsNm9FHja7DTFfrSWimiuacVTjNTBKfdDiqsEIDntijNXVx7RZCQZ7Ik4K2okF-KPjmsOQoX0FDm7lQA2U2tXK_E9o7ulTdGcMtxr8mY3Pky_7ZNtY3sbtTCw?type=png)](https://mermaid.live/edit#pako:eNpFj70OwjAMhF8l8gSiT9ANqWOZQheUxUpMG5GfykmQUNV3J4UKJn93Op3tBXQ0BC1ohyl1FkdGr8JHiYGdnCJnsajQxzAKa1SQmW3Fwu7HaQsNm9FHja7DTFfrSWimiuacVTjNTBKfdDiqsEIDntijNXVx7RZCQZ7Ik4K2okF-KPjmsOQoX0FDm7lQA2U2tXK_E9o7ulTdGcMtxr8mY3Pky_7ZNtY3sbtTCw)