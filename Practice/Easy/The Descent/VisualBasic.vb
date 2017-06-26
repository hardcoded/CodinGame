Module Player

    Sub Main ()

        ' game loop
        While True
            Dim highestMountain As Integer
            highestMountain = 0
            Dim highestMountainIndex As Integer
            highestMountainIndex = 0
            For i as Integer = 0 To 7
                Dim mountainH as Integer
                mountainH = Console.ReadLine() ' represents the height of one mountain.
                If mountainH > highestMountain Then
                    highestMountainIndex = i
                    highestMountain = mountainH
                End If
            Next

            Console.WriteLine(highestMountainIndex) ' The index of the mountain to fire on.
        End While
    End Sub
End Module
