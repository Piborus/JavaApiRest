package med.voll.api.domain.paciente;

public record DadosListaPaciente(


        Long id,
        String nome,

        String email,

        String cpf
) {
    public DadosListaPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
