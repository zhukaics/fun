if myself == 13 then
    my_next = 1
    my_previous = 12
elseif myself == 1 then
    my_next = 2
    my_previous = 13
else
    my_next = myself + 1
    my_previous = myself - 1
end

my_bool = colors[my_previous] == 1

hands = raise(my_bool)

if hands[my_next] then
    answer = 1
else
    answer = 2
end
