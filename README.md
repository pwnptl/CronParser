# CronParser

Input format:

` * * * * * command`

Loosely `<Minute> <Hour> <Day> <Month> <Weekday> command`

Output :
```
[
  [Minute of the Hour (0-59): 0, ..., 59 ], 
  [Hour of the Day (0-23): 0, ..., 23 ], 
  [Day of Month (1-31): 1, ..., 31], 
  [Month of the Year (1-12): 1, ..., 12], 
  [Weekday(s) of the Day (0 SUNDAY- 6 SATURDAY): 0, ..., 6]
]
```

Expressions Supports :
1. `,` Comma : accepts the
2. `*` Astresik : generate all results.
3. `*/`: Divide : gives total of n
4. `-`: Hyphen: accept the range.

Note: inputs should be numeric 