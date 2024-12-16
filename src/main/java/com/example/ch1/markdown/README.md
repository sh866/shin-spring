# 소개 Blog Service
--------------------

- 블로그 검새색과 관련된 서비스를 제공합니다 .

# 빌드 결과물 
- [결과물 다운로드](https//www.naver.com)


# 환경소개
- java 17
- SpringBoot 3.3
- ... 

# module - application 
-------------------

- 도멘인 엔티티, 입력 포트, ----
  - `domain`
  - `service`
  - `port/input`

# 1. 블로그 검색 

### 사용

> `$ http GET Http:// localhost`
> 
### 요청 

Parameter 

| NAME | TYPE | DESCRIPTION | REQUIRED 
|------|-------|-------------|--------
| `KEYWORD` | `STRING` | 검색키워드 | O |
|`URL` | `STRING` |  블로그 URL | X | 


