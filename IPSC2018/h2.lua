
function calc_hand(self)
    local ci = 1
    local hand = 0

    local debug = ""
    while ci < 13 do
        local current = self + ci
        if (self + ci > 13) then
            current = self + ci  - 13
        end

        if colors[current] ~= nil then
            bit = (colors[current] >> (ci - 1)) & 1
        else
            bit = 0
        end

        hand = hand ~ bit

        debug = debug .. bit

        ci = ci + 1
    end

    return hand
end

function dump_table(table)
    local dump = ""
    local index = 1
    while index <= 13 do
        if index ~= 1 then
            dump = dump .. ", "
        end

        if table[index] ~= nil then
            dump = dump .. string.format("%s", table[index])
        else
            dump = dump .. "nil"
        end

        index = index + 1
    end

    return dump
end

my_hand = calc_hand(myself)

hands = raise(my_hand == 1)


answer = 0

index = 1

while index < 13 do
    local current = myself + index
    if current > 13 then
        current = current - 13
    end

    suppose = calc_hand(current)

    if hands[current] then
        actual = 1
    else
        actual = 0
    end

    answer = (answer << 1) + (suppose ~ actual) 

    index = index + 1
end

