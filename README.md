```
http://localhost:8080/get-data?sort=name,-date&page[number]=1&page[size]=1&filter[name]=benwei,zhu&filter[date]=2020-11-11
```
Need to encode ```'[' to %5B and ']' %5D```
```
http://localhost:8080/get-data?sort=name,-date&page%5Bnumber%5D=1&page%5Bsize%5D=1&filter%5Bname%5D=benwei,zhu&filter%5Bdate%5D=2020-11-11
```

```
{
  "sort": [
    "name",
    "-date"
  ],
  "page": {
    "number": 1,
    "size": 1
  },
  "filter": {
    "date": [
      "2020-11-11"
    ],
    "name": [
      "benwei",
      "zhu"
    ]
  }
}
```