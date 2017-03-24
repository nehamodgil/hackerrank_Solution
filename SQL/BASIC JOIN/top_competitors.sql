select B.hacker_id, B.name from
    (select A.hacker_id, A.challenge_id from submissions A
       LEFT JOIN challenges B on A.challenge_id = B.challenge_id
       LEFT JOIN difficulty C on B.difficulty_level = C.difficulty_level where A.score = C.score)
A LEFT JOIN hackers B on A.hacker_id = B.hacker_id group by A.hacker_id having count(A.challenge_id) > 1 order by count(A.challenge_id) desc, A.hacker_id
